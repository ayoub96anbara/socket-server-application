# socket-server-application <br> 
partie client: https://github.com/ayoub96anbara/socket-client-application
<br>
# le cours:
Pr Abdelwahab Naji <br>
-vedio:<br>
https://www.youtube.com/watch?v=JijlMqTdsaM&ab_channel=AbdelwahabNaji <br>
-pdf:<br>
inside to this project <br>
### my notes:<br>
https://www.youtube.com/watch?v=JijlMqTdsaM&ab_channel=AbdelwahabNaji
---------------

socket represente une interface logicielle avec les services de systeme d'exploitation
a l aide de cette interface, le dev exploite les services des protocoles reseaux "pour faire 
communicquer des applications:

(1) Des classes qui fournissent des informations sur les machines 
(2) Des classes pour envoyer et recevoir des flots de donnees

la communication est en mode connecte (TCP) ou non connecte (UDP)

java assure une communication entre machines a l'aide des sockets

Etape 1:
- avoir des informations reseaux sur une machine connectee
- etablir une liaison entre le serveur et le client
- Echange des flots de donnees entre le serveur et le client

Etape 2:
- Echange de flots de donnees entre le serveur et plusieurs clients 

-------------------------
https://www.youtube.com/watch?v=dxB3Rez7w0g

Realtime:
--------

Informe the client that data have changed
Client don't need to send another request to get data


  Emitting Events --------------             Listen for server events
  _______________                                ________
   Client        |----------Web Socket----------| Server |   
  ---------------                                --------
  Listen for    ---------------------------   Emitting Events                            
  server events
  
-----------------------------------------  
Best library to achieve web socket :https://socket.io/  
