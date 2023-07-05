package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.utils.SafeXmlUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class SupplementaryDataUtils {

    public static List<String> extract(final String sourceXml) {
        List<String> result = new ArrayList<>();
        try {
            // Create an XML document from the string
            DocumentBuilder builder = SafeXmlUtils.documentBuilder();
            Document document = builder.parse(new InputSource(new StringReader(sourceXml)));

            // Extract the "SplmtryData" elements recursively
            NodeList splmtryDataList = extractSplmtryData(document.getDocumentElement());

            // Process the extracted "SplmtryData" elements
            for (int i = 0; i < splmtryDataList.getLength(); i++) {
                Node splmtryData = splmtryDataList.item(i);
                // Convert the "SplmtryData" element to XML string
                String splmtryDataXml = nodeToString(splmtryData);
                // Add the "SplmtryData" XML string to the result list
                result.add(splmtryDataXml);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    private static NodeList extractSplmtryData(Element element) {
        NodeList splmtryDataList = element.getElementsByTagName("SplmtryData");
        for (int i = 0; i < element.getChildNodes().getLength(); i++) {
            Node childNode = element.getChildNodes().item(i);
            if (childNode instanceof Element) {
                NodeList childSplmtryDataList = extractSplmtryData((Element) childNode);
                appendNodeList(splmtryDataList, childSplmtryDataList);
            }
        }
        return splmtryDataList;
    }

    private static void appendNodeList(NodeList destination, NodeList source) {
        for (int i = 0; i < source.getLength(); i++) {
            destination.item(0).getParentNode().appendChild(source.item(i));
        }
    }

    private static String nodeToString(Node node) throws Exception {
        Transformer transformer = SafeXmlUtils.transformer();
        StringWriter writer = new StringWriter();
        transformer.transform(new DOMSource(node), new StreamResult(writer));
        return writer.toString();
    }

}