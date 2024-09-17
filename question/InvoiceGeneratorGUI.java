import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class InvoiceGeneratorGUI extends JFrame {
    private JTextField customerNameField, invoiceNumberField, dateField, productNameField, quantityField, priceField;
    private JTextArea invoiceDisplay;
    private JLabel imageLabel;
    private List<String> productList;
    private double grandTotal = 0.0;
    private String shopName = "Gandhi's Shop";
    private String ownerName = "Jatin Gandhi";
    private String imagePath = "";

    public InvoiceGeneratorGUI() {
        setTitle("Invoice Bill Generator");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top Panel for Shop Info, Customer Info, and Invoice Info
        JPanel topPanel = new JPanel(new GridLayout(4, 2));
        topPanel.add(new JLabel("Shop Name:"));
        JLabel shopNameLabel = new JLabel(shopName);
        topPanel.add(shopNameLabel);

        topPanel.add(new JLabel("Owner:"));
        JLabel ownerNameLabel = new JLabel(ownerName);
        topPanel.add(ownerNameLabel);

        topPanel.add(new JLabel("Customer Name:"));
        customerNameField = new JTextField();
        topPanel.add(customerNameField);

        topPanel.add(new JLabel("Invoice Number:"));
        invoiceNumberField = new JTextField();
        topPanel.add(invoiceNumberField);

        topPanel.add(new JLabel("Date:"));
        dateField = new JTextField();
        topPanel.add(dateField);

        add(topPanel, BorderLayout.NORTH);

        // Center Panel for Product Info and Image Upload
        JPanel centerPanel = new JPanel(new GridLayout(3, 3));
        centerPanel.add(new JLabel("Product Name:"));
        productNameField = new JTextField();
        centerPanel.add(productNameField);

        centerPanel.add(new JLabel("Quantity:"));
        quantityField = new JTextField();
        centerPanel.add(quantityField);

        centerPanel.add(new JLabel("Price:"));
        priceField = new JTextField();
        centerPanel.add(priceField);

        // Image Upload Button
        JButton uploadImageButton = new JButton("Upload Image");
        centerPanel.add(uploadImageButton);

        // Image Display Area
        imageLabel = new JLabel();
        centerPanel.add(imageLabel);

        add(centerPanel, BorderLayout.CENTER);

        // Bottom Panel for Buttons and Display Area
        JPanel bottomPanel = new JPanel(new FlowLayout());
        JButton addButton = new JButton("Add Product");
        JButton generateButton = new JButton("Generate Invoice");

        invoiceDisplay = new JTextArea(10, 40);
        invoiceDisplay.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(invoiceDisplay);

        bottomPanel.add(addButton);
        bottomPanel.add(generateButton);

        add(bottomPanel, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.EAST);

        productList = new ArrayList<>();

        // Action listener for uploading image
        uploadImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                uploadImage();
            }
        });

        // Action listener for adding products
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addProduct();
            }
        });

        // Action listener for generating the invoice
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    generateInvoice();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error generating invoice: " + ex.getMessage());
                }
            }
        });
    }

    private void uploadImage() {
        // Create a file chooser to load an image
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            imagePath = fileChooser.getSelectedFile().getAbsolutePath();
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            imageLabel.setIcon(imageIcon);
            invoiceDisplay.append("Image uploaded: " + imagePath + "\n");
        }
    }

    private void addProduct() {
        String productName = productNameField.getText();
        int quantity = Integer.parseInt(quantityField.getText());
        double price = Double.parseDouble(priceField.getText());
        double total = quantity * price;

        productList.add("Product Name: " + productName + ", Quantity: " + quantity + ", Price: $" + price + ", Total: $" + total);
        grandTotal += total;

        invoiceDisplay.append("Added Product: " + productName + ", Total: $" + total + "\n");

        // Clear product fields for next entry
        productNameField.setText("");
        quantityField.setText("");
        priceField.setText("");
    }

    private void generateInvoice() throws IOException {
        String customerName = customerNameField.getText();
        String invoiceNumber = invoiceNumberField.getText();
        String date = dateField.getText();

        if (customerName.isEmpty() || invoiceNumber.isEmpty() || date.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all invoice details!");
            return;
        }

        // Creating and saving invoice
        String fileName = "invoice_" + invoiceNumber + ".txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("Shop Name: " + shopName);
            writer.println("Owner: " + ownerName);
            writer.println("Invoice Number: " + invoiceNumber);
            writer.println("Date: " + date);
            writer.println("Customer Name: " + customerName);
            writer.println("============================");

            for (String product : productList) {
                writer.println(product);
            }

            writer.println("============================");
            writer.println("Grand Total: $" + grandTotal);
            if (!imagePath.isEmpty()) {
                writer.println("Image Path: " + imagePath);
            }
        }

        JOptionPane.showMessageDialog(null, "Invoice saved to " + fileName);
        resetFields();
    }

    private void resetFields() {
        customerNameField.setText("");
        invoiceNumberField.setText("");
        dateField.setText("");
        imageLabel.setIcon(null);
        invoiceDisplay.setText("");
        productList.clear();
        grandTotal = 0.0;
        imagePath = "";
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InvoiceGeneratorGUI().setVisible(true);
            }
        });
    }
}
