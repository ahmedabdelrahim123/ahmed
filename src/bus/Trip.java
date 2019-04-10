package bus;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author gcs
 */
public class Trip {
     
    public static void main(String[] args) throws Exception {
        
        DocumentBuilderFactory   documentBuilderFactory=  DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
        Document document=documentBuilder.newDocument();
        
        Element element= document.createElement("Developer");
        document.appendChild(element);
        Element password1=document.createElement("password1");
        password1.appendChild(document.createTextNode("1234"));
        element.appendChild(password1);
        ///////////////////////////////////////////////
          document.appendChild(element);
        Element password2=document.createElement("password2");
        password2.appendChild(document.createTextNode("1111"));
        element.appendChild(password2);
        ////////////////////////////////////////////////
          document.appendChild(element);
        Element password3=document.createElement("password3");
        password3.appendChild(document.createTextNode("4444"));
        element.appendChild(password3);
        
        Element username=document.createElement("username");
        username.appendChild(document.createTextNode("ahmed"));
         username.appendChild(document.createTextNode("tony"));
          username.appendChild(document.createTextNode("fathy"));
        element.appendChild(username);
        
  
        
       
        TransformerFactory transformerfactory=TransformerFactory.newInstance();
        Transformer  transformer= transformerfactory .newTransformer();
        DOMSource source= new DOMSource(document);
        StreamResult StreamResult=new StreamResult(new File("C:\\Users\\gcs\\Documents\\NetBeansProjects\\Bus\\trips\\trip information.xml"));
         transformer.transform(source, StreamResult);
        
}

      
    
 }