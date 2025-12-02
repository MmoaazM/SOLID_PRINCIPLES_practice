# SOLID_PRINCIPLES_practice
this repo takes bad designed code and apply SOLID principles to it 

## 1- make interface of message_service to generalize slackMessages and emailmessages -> OCP & DIP & LSP

## 2- make alterNotification and promotionNotification subclasses of super abstract class Notification -> OCP & DIP & LSP  AND help us not make all informtion needed in the Notification Class -> SRP

## 3- AS a result of steps 1 & 2 I could apply SRP as I get rid of validation not needed in Notification manager - we minimized the Process function to just 2 lines - 
