public class Slot {

    public static void main(String[] args) {

      
        String[][] frutas = {
            {"\uD83C\uDF4E", "\uD83C\uDF4B", "\uD83C\uDF4A", "\uD83C\uDF47", "\uD83C\uDF53"}, // Frutas
            {"\uD83C\uDF49", "\uD83C\uDF4D", "\uD83C\uDF52", "\uD83C\uDF48", "\uD83C\uDF51"} // Dulces
        };

        
        String[][] gemas = {
            {"💎", "🔷", "💍", "❤️", "💠"}, 
            {"🌟", "✨", "💖", "💫", "💎"}
        };

        
        String[][] halloween = {
            {"🎃", "👻", "🦇", "🕸️", "🕷️"}, 
            {"🌙", "⚰️", "🦉", "🔮", "🧛"} 
        };

      
        String[][] navidad = {
            {"🎄", "🎅", "🎁", "❄️", "⛄"}, 
            {"🌟", "🕯️", "🦌", "🔔", "🎉"} 
        };

        
        System.out.println("Frutas y Dulces:");
        cargarSlot(frutas);
        System.out.println("\nGemas y Joyas:");
        cargarSlot(gemas);
        System.out.println("\nHalloween y Terror:");
        cargarSlot(halloween);
        System.out.println("\nNavidad y Festividades:");
        cargarSlot(navidad);
    }

 
    
    
    
    public static void cargarSlot(String[][] emojis) {
        for (int i = 0; i < emojis.length; i++) {
            for (int j = 0; j < emojis[i].length; j++) {
                int aleatorio = (int) (Math.random() * emojis[i].length);
                System.out.print(emojis[i][aleatorio] + "     ");
            }
            System.out.println();
        }
    }
}
