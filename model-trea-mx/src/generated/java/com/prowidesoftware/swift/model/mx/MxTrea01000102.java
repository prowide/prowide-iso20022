
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
 * Class for trea.010.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "amdFXOptnV02"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:trea.010.001.02")
public class MxTrea01000102
    extends AbstractMX
{

    @XmlElement(name = "AmdFXOptnV02", required = true)
    protected AmendForeignExchangeOptionV02 amdFXOptnV02;
    public final static transient String BUSINESS_PROCESS = "trea";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate1 .class, AmendForeignExchangeOptionV02 .class, AmountsAndValueDate2 .class, FundIdentification2 .class, MxTrea01000102 .class, NameAndAddress8 .class, Option3 .class, OptionParty1Code.class, OptionStyle2Code.class, PartyIdentification22 .class, PartyIdentification8Choice.class, PostalAddress1 .class, PremiumAmount2 .class, PremiumQuote1Choice.class, SettlementType1Code.class, TradeAgreement2 .class, TradePartyIdentification4 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:trea.010.001.02";

    public MxTrea01000102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrea01000102(final String xml) {
        this();
        MxTrea01000102 tmp = parse(xml);
        amdFXOptnV02 = tmp.getAmdFXOptnV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrea01000102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the amdFXOptnV02 property.
     * 
     * @return
     *     possible object is
     *     {@link AmendForeignExchangeOptionV02 }
     *     
     */
    public AmendForeignExchangeOptionV02 getAmdFXOptnV02() {
        return amdFXOptnV02;
    }

    /**
     * Sets the value of the amdFXOptnV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendForeignExchangeOptionV02 }
     *     
     */
    public MxTrea01000102 setAmdFXOptnV02(AmendForeignExchangeOptionV02 value) {
        this.amdFXOptnV02 = value;
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
    public static MxTrea01000102 parse(String xml) {
        return ((MxTrea01000102) MxReadImpl.parse(MxTrea01000102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrea01000102 parse(String xml, MxRead parserImpl) {
        return ((MxTrea01000102) parserImpl.read(MxTrea01000102 .class, xml, _classes));
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
     * Creates an MxTrea01000102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrea01000102 message
     * @return
     *     a new instance of MxTrea01000102
     */
    public final static MxTrea01000102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTrea01000102 .class);
    }

}
