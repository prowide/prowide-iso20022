package com.prowidesoftware.sandbox;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Element;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.Diff;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Generic default treatment of XmlANYElement by JAXB unmarshalling and marshalling
 */
public class XmlAnyElementTest {

    private Unmarshaller unmarshaller;
    private Marshaller marshaller;

    @BeforeEach
    public void setuo() throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Payload.class);
        unmarshaller = jc.createUnmarshaller();
        marshaller = jc.createMarshaller();
    }

    @Test
    public void testSingleElement() throws JAXBException {

        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<payload>\n" +
                "    <other/>\n" +
                "</payload>";

        Payload payload = (Payload) unmarshaller.unmarshal(new StringReader(xml));
        System.out.println(payload.any.getClass());
        assertTrue(payload.any instanceof Element);

        StringWriter w = new StringWriter();
        marshaller.marshal(payload, w);
        assertXmlEquals(xml, w.toString());
    }

    @Test
    public void testSingleWithContent() throws JAXBException {

        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<payload>\n" +
                "    <other>FOOBAR</other>\n" +
                "</payload>";

        Payload payload = (Payload) unmarshaller.unmarshal(new StringReader(xml));
        System.out.println(payload.any.getClass());
        assertTrue(payload.any instanceof Element);
        assertEquals("FOOBAR", ((Element) payload.any).getTextContent());

        StringWriter w = new StringWriter();
        marshaller.marshal(payload, w);
        assertXmlEquals(xml, w.toString());
    }

    @Test
    public void testSingleWithChildNode() throws JAXBException {

        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<payload>\n" +
                "    <other><foo>bar</foo></other>\n" +
                "</payload>";

        Payload payload = (Payload) unmarshaller.unmarshal(new StringReader(xml));
        System.out.println(payload.any.getClass());
        assertTrue(payload.any instanceof Element);
        Element anyElement = (Element) payload.any;
        assertEquals("bar", anyElement.getTextContent());
        assertTrue(anyElement.hasChildNodes());

        StringWriter w = new StringWriter();
        marshaller.marshal(payload, w);
        assertXmlEquals(xml, w.toString());
        System.out.println(w);
    }

    @Test
    public void testMultipleElements() throws JAXBException {

        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<payload>\n" +
                "    <other><foo>foo1</foo><bar>bar1</bar></other>\n" +
                "</payload>";

        Payload payload = (Payload) unmarshaller.unmarshal(new StringReader(xml));
        System.out.println(payload.any.getClass());
        assertTrue(payload.any instanceof Element);
        Element anyElement = (Element) payload.any;
        assertEquals("foo1bar1", anyElement.getTextContent());
        assertTrue(anyElement.hasChildNodes());

        StringWriter w = new StringWriter();
        marshaller.marshal(payload, w);
        assertXmlEquals(xml, w.toString());
        System.out.println(w);
    }

    private void assertXmlEquals(String control, String test) {
        Diff diff = DiffBuilder.compare(control).withTest(test).ignoreWhitespace().build();
        assertFalse(diff.hasDifferences());
    }

}
