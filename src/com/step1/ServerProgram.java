package com.step1;

import com.dao.Client;
import com.dao.ClientDAO;
import com.dao.Compte;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {

    private static final int PORT = 3333;
    private ServerSocket serverSocket = null;
    private Socket socketEnd1;
    private InputStream input;
    private OutputStream output;
    private ClientDAO dao;

    public ServerProgram() {
        try {
            System.out.println("command :  server start....");
            serverSocket = new ServerSocket(PORT);
            System.out.println("command:   server status ==> running");
            dao = new ClientDAO();

        } catch (IOException e) {
            System.err.println("command:   server status ==> failed");
            e.printStackTrace();
        }
    }

    public void acceptConnexion() {
        // create socket cote serveur

        try {
            System.out.println("attente de demande....");
            socketEnd1 = serverSocket.accept();
            System.out.println("connexion etablie....");
            input = socketEnd1.getInputStream();
            output = socketEnd1.getOutputStream();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void sendInfosCompte() {
        try {
            int num = input.read();
            System.out.println("numero recu du compte: " + num);


            Client client = dao.getOne(num);
            if (client != null) {

               /*  preparer un msg
                String msg = "welcomme " + client.getNom() + " " + client.getPrenom();
                PrintWriter printWriter = new PrintWriter(output);
                printWriter.println(msg);
                printWriter.flush();
                printWriter.close();
                */
                // preparer un object
                ObjectOutputStream os = new ObjectOutputStream(output);
                os.writeObject(client);
                os.flush();
                os.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        ServerProgram server = new ServerProgram();
        server.acceptConnexion(); // lorsque je recois une demande
        server.sendInfosCompte();
    }
}
