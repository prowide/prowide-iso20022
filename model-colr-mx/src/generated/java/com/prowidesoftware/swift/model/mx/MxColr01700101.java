
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
 * Class for colr.017.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "xcssCshMrgnInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT1colr.017.001.01")
public class MxColr01700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "XcssCshMrgnInstr", required = true)
    protected ExcessCashMarginInstructionV01 xcssCshMrgnInstr;
    public static final transient String BUSINESS_PROCESS = "colr";
    public static final transient int FUNCTIONALITY = 17;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection52 .class, ContactDetails2 .class, CreditDebitCode.class, DateAndPlaceOfBirth1 .class, ExcessCashInstruction1 .class, ExcessCashInstructionHeader1 .class, ExcessCashMarginInstructionV01 .class, ExcessCashRequestType1Choice.class, ExcessCashRequestType1Code.class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MarketIdentification3Choice.class, MxColr01700101 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party34Choice.class, PartyIdentification125 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT1colr.017.001.01";

    public MxColr01700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr01700101(final String xml) {
        this();
        MxColr01700101 tmp = parse(xml);
        xcssCshMrgnInstr = tmp.getXcssCshMrgnInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr01700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the xcssCshMrgnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link ExcessCashMarginInstructionV01 }
     *     
     */
    public ExcessCashMarginInstructionV01 getXcssCshMrgnInstr() {
        return xcssCshMrgnInstr;
    }

    /**
     * Sets the value of the xcssCshMrgnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcessCashMarginInstructionV01 }
     *     
     */
    public MxColr01700101 setXcssCshMrgnInstr(ExcessCashMarginInstructionV01 value) {
        this.xcssCshMrgnInstr = value;
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
    public static MxColr01700101 parse(String xml) {
        return ((MxColr01700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr01700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr01700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr01700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr01700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr01700101 parse(String xml, MxRead parserImpl) {
        return ((MxColr01700101) parserImpl.read(MxColr01700101 .class, xml, _classes));
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
     * Creates an MxColr01700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr01700101 message
     * @return
     *     a new instance of MxColr01700101
     */
    public static final MxColr01700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr01700101 .class);
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
