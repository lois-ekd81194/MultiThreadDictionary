public class Client {
    private ClientGUI operateWindow;
    Client(){
        operateWindow = new ClientGUI();
    }
    public static void main(String[] args) {
        Client client = new Client();
        client.operateWindow.setVisible(true);

    }
}
