
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.065.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "lmtUtlstnJrnlRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.065.001.01")
public class MxCamt06500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "LmtUtlstnJrnlRpt", required = true)
    protected LimitUtilisationJournalReportV01 lmtUtlstnJrnlRpt;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 65;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, Amount2Choice.class, CreditDebitAmount1 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, ErrorHandling3Choice.class, ErrorHandling5 .class, GenericAccountIdentification1 .class, GenericIdentification36 .class, LimitAmount1 .class, LimitIdentification7 .class, LimitJournal3 .class, LimitJournalEntry3 .class, LimitJournalReport4 .class, LimitJournalReportOrError7Choice.class, LimitJournalReportOrError8Choice.class, LimitType4Code.class, LimitUtilisationJournalReportV01 .class, MessageHeader12 .class, MxCamt06500101 .class, NameAndAddress5 .class, OriginalBusinessInstruction1 .class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PostalAddress1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.065.001.01";

    public MxCamt06500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt06500101(final String xml) {
        this();
        MxCamt06500101 tmp = parse(xml);
        lmtUtlstnJrnlRpt = tmp.getLmtUtlstnJrnlRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt06500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the lmtUtlstnJrnlRpt property.
     * 
     * @return
     *     possible object is
     *     {@link LimitUtilisationJournalReportV01 }
     *     
     */
    public LimitUtilisationJournalReportV01 getLmtUtlstnJrnlRpt() {
        return lmtUtlstnJrnlRpt;
    }

    /**
     * Sets the value of the lmtUtlstnJrnlRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitUtilisationJournalReportV01 }
     *     
     */
    public MxCamt06500101 setLmtUtlstnJrnlRpt(LimitUtilisationJournalReportV01 value) {
        this.lmtUtlstnJrnlRpt = value;
        return this;
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt06500101 parse(String xml) {
        return ((MxCamt06500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt06500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt06500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt06500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt06500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt06500101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt06500101) parserImpl.read(MxCamt06500101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxCamt06500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt06500101 message
     * @return
     *     a new instance of MxCamt06500101
     */
    public static final MxCamt06500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt06500101 .class);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
