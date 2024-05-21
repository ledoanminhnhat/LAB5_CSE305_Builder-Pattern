/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse305_lab5;

/**
 *
 * @author admin
 */
public class Message {
    private String content;
    private String sender;
    private String recipient;
  
    private Message() {}

    
    public static class Builder {
        private String content;
        private String sender;
        private String recipient;
        

        public Builder() {}

       
        public Message build() {
            Message message = new Message();
            message.content = this.content;
            message.sender = this.sender;
            message.recipient = this.recipient;
          
            return message;
        }
    }
}

