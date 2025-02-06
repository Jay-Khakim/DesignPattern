import java.util.ArrayList;
import java.util.List;

// Abstract Class for Body Blocks
abstract class BodyBlock {
    public abstract String render();
}

// Text Paragraph Block
class TextBlock extends BodyBlock {
    private String text;

    public TextBlock(String text) {
        this.text = text;
    }

    @Override
    public String render() {
        return text;
    }
}

// List Paragraph Block
class ListBlock extends BodyBlock {
    private List<String> items;

    public ListBlock(List<String> items) {
        this.items = items;
    }

    @Override
    public String render() {
        StringBuilder sb = new StringBuilder();
        for (String item : items) {
            sb.append("- ").append(item).append("\n");
        }
        return sb.toString();
    }
}

// Image Paragraph Block
class ImageBlock extends BodyBlock {
    private String imageUrl;
    private String altText;

    public ImageBlock(String imageUrl, String altText) {
        this.imageUrl = imageUrl;
        this.altText = altText;
    }

    @Override
    public String render() {
        return "[Image: " + imageUrl + " | Alt: " + altText + "]";
    }
}

// Email Class
class Email {
    private String header;
    private List<BodyBlock> body;
    private String footer;

    private Email(String header, List<BodyBlock> body, String footer) {
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    public String render() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== ").append(header).append(" ===\n\n");

        for (BodyBlock block : body) {
            sb.append(block.render()).append("\n\n");
        }

        sb.append("=== ").append(footer).append(" ===");
        return sb.toString();
    }

    // Builder Class
    public static class EmailBuilder {
        private String header;
        private List<BodyBlock> body = new ArrayList<>();
        private String footer;

        public EmailBuilder setHeader(String header) {
            this.header = header;
            return this;
        }

        public EmailBuilder addTextBlock(String text) {
            this.body.add(new TextBlock(text));
            return this;
        }

        public EmailBuilder addListBlock(List<String> items) {
            this.body.add(new ListBlock(items));
            return this;
        }

        public EmailBuilder addImageBlock(String imageUrl, String altText) {
            this.body.add(new ImageBlock(imageUrl, altText));
            return this;
        }

        public EmailBuilder setFooter(String copyright, String unsubscribeLink) {
            this.footer = "Copyright: " + copyright + " | Unsubscribe: " + unsubscribeLink;
            return this;
        }

        public Email build() {
            return new Email(header, body, footer);
        }
    }
}

// Usage
public class EmailBuilder {
    public static void main(String[] args) {
        Email email = new Email.EmailBuilder()
                .setHeader("Welcome to Our Newsletter")
                .addTextBlock("Hello! We are excited to share our latest updates.")
                .addListBlock(List.of("New Features", "Product Updates", "Exclusive Offers"))
                .addImageBlock("https://example.com/image.jpg", "Newsletter Banner")
                .setFooter("2024 MyCompany", "https://example.com/unsubscribe")
                .build();

        System.out.println(email.render());
    }
}