
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
 * Class for trea.002.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "amdNDFOpngV02"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:trea.002.001.02")
public class MxTrea00200102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AmdNDFOpngV02", required = true)
    protected AmendNonDeliverableForwardOpeningV02 amdNDFOpngV02;
    public static final transient String BUSINESS_PROCESS = "trea";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate1 .class, AmendNonDeliverableForwardOpeningV02 .class, AmountsAndValueDate1 .class, FundIdentification2 .class, MxTrea00200102 .class, NameAndAddress8 .class, NonDeliverableForwardValuationConditions2 .class, PartyIdentification22 .class, PartyIdentification8Choice.class, PostalAddress1 .class, TradeAgreement2 .class, TradePartyIdentification3 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:trea.002.001.02";

    public MxTrea00200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrea00200102(final String xml) {
        this();
        MxTrea00200102 tmp = parse(xml);
        amdNDFOpngV02 = tmp.getAmdNDFOpngV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrea00200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the amdNDFOpngV02 property.
     * 
     * @return
     *     possible object is
     *     {@link AmendNonDeliverableForwardOpeningV02 }
     *     
     */
    public AmendNonDeliverableForwardOpeningV02 getAmdNDFOpngV02() {
        return amdNDFOpngV02;
    }

    /**
     * Sets the value of the amdNDFOpngV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendNonDeliverableForwardOpeningV02 }
     *     
     */
    public MxTrea00200102 setAmdNDFOpngV02(AmendNonDeliverableForwardOpeningV02 value) {
        this.amdNDFOpngV02 = value;
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
    public static MxTrea00200102 parse(String xml) {
        return ((MxTrea00200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrea00200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTrea00200102 parse(String xml, MxReadConfiguration conf) {
        return ((MxTrea00200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrea00200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrea00200102 parse(String xml, MxRead parserImpl) {
        return ((MxTrea00200102) parserImpl.read(MxTrea00200102 .class, xml, _classes));
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
     * Creates an MxTrea00200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrea00200102 message
     * @return
     *     a new instance of MxTrea00200102
     */
    public static final MxTrea00200102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTrea00200102 .class);
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
