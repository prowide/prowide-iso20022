
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
 * Class for sese.042.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "buyInRgltryAdvcRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.042.001.02")
public class MxSese04200102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BuyInRgltryAdvcRspn", required = true)
    protected BuyInRegulatoryAdviceResponseV02 buyInRgltryAdvcRspn;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 42;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus33Choice.class, AcknowledgementReason10Code.class, AcknowledgementReason21 .class, AcknowledgementReason24Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AmountAndDirection102 .class, BuyInAdviceDetails2 .class, BuyInDeferral1Code.class, BuyInRegulatoryAdviceResponseV02 .class, BuyInState1Code.class, DateAndDateTime2Choice.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, Identification14 .class, IdentificationSource3Choice.class, MxSese04200102 .class, NoReasonCode.class, OtherIdentification1 .class, PartyIdentification127Choice.class, PartyIdentification144 .class, ProcessingStatus79Choice.class, RateAndAmountFormat39Choice.class, References31 .class, RejectionAndRepairReason25Choice.class, RejectionOrRepairReason25 .class, RejectionOrRepairStatus31Choice.class, RejectionReason27Code.class, SecuritiesAccount19 .class, SecurityIdentification19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.042.001.02";

    public MxSese04200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese04200102(final String xml) {
        this();
        MxSese04200102 tmp = parse(xml);
        buyInRgltryAdvcRspn = tmp.getBuyInRgltryAdvcRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese04200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the buyInRgltryAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link BuyInRegulatoryAdviceResponseV02 }
     *     
     */
    public BuyInRegulatoryAdviceResponseV02 getBuyInRgltryAdvcRspn() {
        return buyInRgltryAdvcRspn;
    }

    /**
     * Sets the value of the buyInRgltryAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyInRegulatoryAdviceResponseV02 }
     *     
     */
    public MxSese04200102 setBuyInRgltryAdvcRspn(BuyInRegulatoryAdviceResponseV02 value) {
        this.buyInRgltryAdvcRspn = value;
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
    public static MxSese04200102 parse(String xml) {
        return ((MxSese04200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese04200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese04200102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese04200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese04200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese04200102 parse(String xml, MxRead parserImpl) {
        return ((MxSese04200102) parserImpl.read(MxSese04200102 .class, xml, _classes));
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
     * Creates an MxSese04200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese04200102 message
     * @return
     *     a new instance of MxSese04200102
     */
    public static final MxSese04200102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese04200102 .class);
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
