
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for reda.021.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesAcctRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.021.001.01")
public class MxReda02100101
    extends AbstractMX
{

    @XmlElement(name = "SctiesAcctRpt", required = true)
    protected SecuritiesAccountReportV01 sctiesAcctRpt;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 21;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, ErrorHandling3Choice.class, ErrorHandling5 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, MarketSpecificAttribute1 .class, MessageHeader3 .class, MxReda02100101 .class, NameAndAddress5 .class, OriginalBusinessQuery1 .class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PostalAddress1 .class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, SecuritiesAccount19 .class, SecuritiesAccountOrBusinessError3Choice.class, SecuritiesAccountOrOperationalError3Choice.class, SecuritiesAccountReport3 .class, SecuritiesAccountReportV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class, SystemPartyType1Choice.class, SystemRestriction1 .class, SystemSecuritiesAccount6 .class, SystemSecuritiesAccountType1Choice.class, SystemSecuritiesAccountType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.021.001.01";

    public MxReda02100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda02100101(final String xml) {
        this();
        MxReda02100101 tmp = parse(xml);
        sctiesAcctRpt = tmp.getSctiesAcctRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda02100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesAcctRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountReportV01 }
     *     
     */
    public SecuritiesAccountReportV01 getSctiesAcctRpt() {
        return sctiesAcctRpt;
    }

    /**
     * Sets the value of the sctiesAcctRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountReportV01 }
     *     
     */
    public MxReda02100101 setSctiesAcctRpt(SecuritiesAccountReportV01 value) {
        this.sctiesAcctRpt = value;
        return this;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxReda02100101 parse(String xml) {
        return ((MxReda02100101) MxReadImpl.parse(MxReda02100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda02100101 parse(String xml, MxRead parserImpl) {
        return ((MxReda02100101) parserImpl.read(MxReda02100101 .class, xml, _classes));
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
     * Creates an MxReda02100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda02100101 message
     * @return
     *     a new instance of MxReda02100101
     */
    public final static MxReda02100101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxReda02100101 .class);
    }

}
