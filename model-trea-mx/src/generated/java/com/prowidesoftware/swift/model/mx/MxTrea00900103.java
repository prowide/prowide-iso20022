
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
 * Class for trea.009.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cretFXOptnV03"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:trea.009.001.03")
public class MxTrea00900103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CretFXOptnV03", required = true)
    protected CreateForeignExchangeOptionV03 cretFXOptnV03;
    public static final transient String BUSINESS_PROCESS = "trea";
    public static final transient int FUNCTIONALITY = 9;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate1 .class, AmountsAndValueDate4 .class, CreateForeignExchangeOptionV03 .class, FundIdentification2 .class, MxTrea00900103 .class, NameAndAddress8 .class, Option5 .class, OptionParty1Code.class, OptionStyle2Code.class, PartyIdentification22 .class, PartyIdentification8Choice.class, PostalAddress1 .class, PremiumAmount2 .class, PremiumQuote1Choice.class, SettlementType1Code.class, TradeAgreement1 .class, TradePartyIdentification4 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:trea.009.001.03";

    public MxTrea00900103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrea00900103(final String xml) {
        this();
        MxTrea00900103 tmp = parse(xml);
        cretFXOptnV03 = tmp.getCretFXOptnV03();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrea00900103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cretFXOptnV03 property.
     * 
     * @return
     *     possible object is
     *     {@link CreateForeignExchangeOptionV03 }
     *     
     */
    public CreateForeignExchangeOptionV03 getCretFXOptnV03() {
        return cretFXOptnV03;
    }

    /**
     * Sets the value of the cretFXOptnV03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateForeignExchangeOptionV03 }
     *     
     */
    public MxTrea00900103 setCretFXOptnV03(CreateForeignExchangeOptionV03 value) {
        this.cretFXOptnV03 = value;
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
    public static MxTrea00900103 parse(String xml) {
        return ((MxTrea00900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrea00900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTrea00900103 parse(String xml, MxReadConfiguration conf) {
        return ((MxTrea00900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrea00900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrea00900103 parse(String xml, MxRead parserImpl) {
        return ((MxTrea00900103) parserImpl.read(MxTrea00900103 .class, xml, _classes));
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
     * Creates an MxTrea00900103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrea00900103 message
     * @return
     *     a new instance of MxTrea00900103
     */
    public static final MxTrea00900103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTrea00900103 .class);
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
