/*
 * Copyright (c) 2016-2018 Prowide Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of private license agreements
 * between Prowide Inc. and its commercial customers and partners.
 */
package com.prowidesoftware.swift.model.mx;

import org.junit.Ignore;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

/**
 * Test for the {@link MxReadImpl} regex pattern matching
 * @since 9.0.1
 */
public class JaxbUtilsTest {

	@Test
	public void testUnbindNamespace() {
		final String s1 = "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.05\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">";
		final String s1processed = JaxbUtils.unbindNamespace(s1);
		//assertEquals("<Document  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">", s1processed);
		assertEquals("<Document xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">", s1processed);

		final String s2 = "<Doc:Document xmlns:Doc=\"urn:iso:std:iso:20022:tech:xsd:camt.026.001.05\">";
		final String s2processed = JaxbUtils.unbindNamespace(s2);
		assertEquals("<Document>", s2processed);

		final String s3 = "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:camt.026.001.06\">";
		final String s3processed = JaxbUtils.unbindNamespace(s3);
		assertEquals("<Document>", s3processed);

		final String s4 = s1 + s2 + s3;
		final String s4processed = JaxbUtils.unbindNamespace(s4);
		assertEquals(s1processed + s2processed + s3processed, s4processed);

		String s5 =	"<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">";
		final String s5processed = JaxbUtils.unbindNamespace(s5);
		assertEquals("<Document xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">", s5processed);
	}

	@Ignore("CDATA")
	@Test
	public void testUnbindNamespaceIgnoringCDATA() {
		final String embedded = "<Doc:Document xmlns:Doc=\"urn:iso:std:iso:20022:tech:xsd:camt.026.001.05\"><Doc:Foo>bar</Doc:Foo></Doc:Document>";

		String source =	"<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\"><Doc:AddtlInf><![CDATA[" + embedded + "]]></Doc:AddtlInf></Doc:Document>";

		String expectedTarget =	"<Document><AddtlInf><![CDATA[" + embedded + "]]></AddtlInf></Document>";

		final String target = JaxbUtils.unbindNamespace(source);

		assertEquals(expectedTarget, target);
	}

	@Test
	public void testRemovePrefixesResultIsUnchanged() {
		assertEquals(null, JaxbUtils.removePrefixes(null, null));
		assertEquals(null, JaxbUtils.removePrefixes(null, "Foo"));
		assertEquals("", JaxbUtils.removePrefixes("", null));
		assertEquals("", JaxbUtils.removePrefixes("", ""));
		assertEquals("", JaxbUtils.removePrefixes("", "Foo"));
		assertEquals("Foo", JaxbUtils.removePrefixes("Foo", "Foo"));
		assertEquals("<Foo>bar</Foo>", JaxbUtils.removePrefixes("<Foo>bar</Foo>", "Foo"));
		assertEquals("<Doc:Foo>bar</Doc:Foo>", JaxbUtils.removePrefixes("<Doc:Foo>bar</Doc:Foo>", "Foo"));
	}

	@Ignore("CDATA")
	@Test
	public void testRemovePrefixesResultIsChanged() {
		assertEquals("<Foo>bar</Foo>", JaxbUtils.removePrefixes("<Doc:Foo>bar</Doc:Foo>", "Doc"));
		assertEquals("<Foo>Doc</Foo>", JaxbUtils.removePrefixes("<Doc:Foo>Doc</Doc:Foo>", "Doc"));
		assertEquals("<Foo>Doc:</Foo>", JaxbUtils.removePrefixes("<Doc:Foo>Doc:</Doc:Foo>", "Doc"));
		assertEquals("<Foo><Bar>hello world</Bar></Foo>", JaxbUtils.removePrefixes("<Doc:Foo><Doc:Bar>hello world</Doc:Bar></Doc:Foo>", "Doc"));
	}

	@Ignore("CDATA")
	@Test
	public void testRemovePrefixesWithCDATA() {
		// content in CDATA block should be preserved
		assertEquals("<![CDATA[<Doc:Foo>bar</Doc:Foo>]]>", JaxbUtils.removePrefixes("<![CDATA[<Doc:Foo>bar</Doc:Foo>]]>", "Doc"));

		// other elements should be replaced
		assertEquals("<Message><![CDATA[<Doc:Foo>bar</Doc:Foo>]]></Message>", JaxbUtils.removePrefixes("<Doc:Message><![CDATA[<Doc:Foo>bar</Doc:Foo>]]></Doc:Message>", "Doc"));
	}

	@Test
    public void testPatternSwift_1() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<?xml version=\"1.0\" encoding=\"UTF-8\"?><Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">");
		assertTrue(matcher.matches());
		assertEquals("Doc", matcher.group(2));
		assertEquals(" xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\"", matcher.group(1));
    }
    
    /*
     * same as above but in different order 
     */
    @Test
    public void testPatternSwift_1b() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<?xml version=\"1.0\" encoding=\"UTF-8\"?><Doc:Document xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\">");
		assertTrue(matcher.matches());
		assertEquals("Doc", matcher.group(2));
    }

    @Test
    public void testPatternIso_1() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<Doc:Document xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:Doc=\"urn:iso:std:iso:20022:tech:xsd:pain.001.001.02\">");
		assertTrue(matcher.matches());
		assertEquals("Doc", matcher.group(2));
    }
    
    /*
     * same as above but in different order
     */
    @Test
    public void testPatternIso_1b() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<Doc:Document xmlns:Doc=\"urn:iso:std:iso:20022:tech:xsd:pain.001.001.02\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">");
		assertTrue(matcher.matches());
		assertEquals("Doc", matcher.group(2));
    }
    
    @Test
    public void testPatternNoPrefix() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:camt.026.001.04\">");
		assertTrue(matcher.matches());
		assertNotNull(matcher.group(1));
		assertNull(matcher.group(2));	//prefix
    }
    
    @Test
    public void testPatternNoPrefixAndWhitespace() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<Document xmlns = \"urn:iso:std:iso:20022:tech:xsd:camt.026.001.04\">");
		assertTrue(matcher.matches());
		assertNotNull(matcher.group(1));
		assertNull(matcher.group(2)); //prefix
    }

    @Test
    public void testPattern2bWhitespace() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<Doc:Document xmlns:Doc  = \"urn:iso:std:iso:20022:tech:xsd:pain.001.001.02\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">");
		assertTrue(matcher.matches());
		assertEquals("Doc", matcher.group(2));
    }

	@Test
	public void testPatternNonSwift() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<Doc:Document xmlns=\"http://www.six-interbank-clearing.com/de/camt.052.001.02.ch.01\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">");
		assertTrue(matcher.matches());
		assertNull(matcher.group(2));
	}

	@Test
	public void testPatternNonSwiftWithPrefix() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<Doc:Document xmlns:Doc=\"http://www.six-interbank-clearing.com/de/camt.052.001.02.ch.01\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">");
		assertTrue(matcher.matches());
		assertEquals("Doc", matcher.group(2));
	}

    /**
     * This namespaces must not be matched because they should be kept (not removed) when reading the XML
     */
    @Test
    public void testPatternSnl() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<Doc:Document xmlns:sDoc=\"urn:swift:snl:ns.Doc\" xmlns:Sw=\"urn:swift:snl:ns.Sw\" xmlns:SwInt=\"urn:swift:snl:ns.SwInt\" xmlns:SwSec=\"urn:swift:snl:ns.SwSec\" xmlns:SwGbl=\"urn:swift:snl:ns.SwGbl\">");
		assertFalse(matcher.matches());
    }

	@Test
	public void testPatternBAHV1() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<?xml version=\"1.0\" encoding=\"UTF-8\"?><AppHdr xmlns=\"urn:swift:xsd:head.001.001.01\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">");
		assertTrue(matcher.matches());
		assertEquals(" xmlns=\"urn:swift:xsd:head.001.001.01\"", matcher.group(1));
	}

	@Test
	public void testPatternBAHV2() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<?xml version=\"1.0\" encoding=\"UTF-8\"?><AppHdr xmlns=\"urn:swift:xsd:head.001.001.02\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">");
		assertTrue(matcher.matches());
		assertEquals(" xmlns=\"urn:swift:xsd:head.001.001.02\"", matcher.group(1));
	}

	@Test
	public void testPatternAH() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<?xml version=\"1.0\" encoding=\"UTF-8\"?><AppHdr xmlns=\"urn:swift:xsd:$ahV10\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">");
		assertTrue(matcher.matches());
		assertEquals(" xmlns=\"urn:swift:xsd:$ahV10\"", matcher.group(1));
	}

    /***********************************************************************
     * 
     * same test for patterns as above, using single quotes for namespaces
     * 
     ***********************************************************************/
    
    @Test
    public void testPattern1_single() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<?xml version=\"1.0\" encoding=\"UTF-8\"?><Doc:Document xmlns:Doc='urn:swift:xsd:camt.003.001.04' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>");
		assertTrue(matcher.matches());
		assertEquals("Doc", matcher.group(2));
    }
    
    @Test
    public void testPattern1b_single() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<?xml version=\"1.0\" encoding=\"UTF-8\"?><Doc:Document xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:Doc='urn:swift:xsd:camt.003.001.04'>");
		assertTrue(matcher.matches());
		assertEquals("Doc", matcher.group(2));
    }

    @Test
    public void testPattern2_single() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<Doc:Document xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:Doc='urn:iso:std:iso:20022:tech:xsd:pain.001.001.02'>");
		assertTrue(matcher.matches());
		assertEquals("Doc", matcher.group(2));
    }
    
    @Test
    public void testPattern2b_single() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<Doc:Document "+" xmlns:Doc='urn:iso:std:iso:20022:tech:xsd:pain.001.001.02' "+"xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>");
		assertTrue(matcher.matches());
		assertEquals("Doc", matcher.group(2));
    }
    
    @Test
    public void testPatternNoPrefix_single() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<Document xmlns='urn:iso:std:iso:20022:tech:xsd:camt.026.001.04'>");
		assertTrue(matcher.matches());
		assertNotNull(matcher.group(1));
		assertNull(matcher.group(2));	//prefix
    }
    
    @Test
    public void testPatternNoPrefixAndWhitespace_single() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<Document xmlns = 'urn:iso:std:iso:20022:tech:xsd:camt.026.001.04'>");
		assertTrue(matcher.matches());
		assertNotNull(matcher.group(1));
		assertNull(matcher.group(2)); //prefix
    }

    @Test
    public void testPattern2bWhitespace_single() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<Doc:Document "+" xmlns:Doc  = 'urn:iso:std:iso:20022:tech:xsd:pain.001.001.02' "+"xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>");
		assertTrue(matcher.matches());
		assertEquals("Doc", matcher.group(2));
    }

	@Test
	public void testPatternLinebreak() throws Exception {
		final Pattern pat = getPattern();
		Matcher matcher = pat.matcher("<Doc:Document xmlns:Doc=\"urn:swift:xsd:xsys.002.001.01\"\n	xmlns:Sw=\"urn:swift:snl:ns.Sw\" xmlns:SwSec=\"urn:swift:snl:ns.SwSec\"	xmlns:SwInt=\"urn:swift:snl:ns.SwInt\">");
		assertTrue(matcher.matches());
		assertEquals("Doc", matcher.group(2));
		assertEquals(" xmlns:Doc=\"urn:swift:xsd:xsys.002.001.01\"", matcher.group(1));
	}
    
    private Pattern getPattern() throws NoSuchFieldException, IllegalAccessException {
		Field field = JaxbUtils.class.getDeclaredField("xmlnsDocumentPattern");
		field.setAccessible(true);
		return (Pattern) field.get(null);
		//return Pattern.compile(".*([\\s]+?xmlns:?(\\w+)?\\s*=\\s*[\"|'].*([a-zA-Z]{4}\\.\\d{3}\\.\\d{3}\\.\\d{2}|ahV10)[^\\s]*[\"|']).*", Pattern.MULTILINE | Pattern.DOTALL	| Pattern.CASE_INSENSITIVE);
	}

}
