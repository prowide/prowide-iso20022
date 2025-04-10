
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
 * Class for fxtr.007.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ndfNtfctnV03"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:fxtr.007.001.03")
public class MxFxtr00700103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "NDFNtfctnV03", required = true)
    protected NonDeliverableForwardNotificationV03 ndfNtfctnV03;
    public static final transient String BUSINESS_PROCESS = "fxtr";
    public static final transient int FUNCTIONALITY = 7;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate1 .class, AmountsAndValueDate1 .class, ClosingData2 .class, FundIdentification2 .class, MxFxtr00700103 .class, NameAndAddress8 .class, NonDeliverableForwardNotificationV03 .class, NonDeliverableForwardValuationConditions2 .class, OpeningData2 .class, PartyIdentification22 .class, PartyIdentification8Choice.class, PostalAddress1 .class, SettlementData2 .class, SettlementStatus1Code.class, TradePartyIdentification3 .class, TradeStatus1 .class, TradeStatus1Code.class, ValuationData2 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:fxtr.007.001.03";

    public MxFxtr00700103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr00700103(final String xml) {
        this();
        MxFxtr00700103 tmp = parse(xml);
        ndfNtfctnV03 = tmp.getNDFNtfctnV03();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr00700103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ndfNtfctnV03 property.
     * 
     * @return
     *     possible object is
     *     {@link NonDeliverableForwardNotificationV03 }
     *     
     */
    public NonDeliverableForwardNotificationV03 getNDFNtfctnV03() {
        return ndfNtfctnV03;
    }

    /**
     * Sets the value of the ndfNtfctnV03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDeliverableForwardNotificationV03 }
     *     
     */
    public MxFxtr00700103 setNDFNtfctnV03(NonDeliverableForwardNotificationV03 value) {
        this.ndfNtfctnV03 = value;
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
    public static MxFxtr00700103 parse(String xml) {
        return ((MxFxtr00700103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr00700103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr00700103 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr00700103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr00700103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr00700103 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr00700103) parserImpl.read(MxFxtr00700103 .class, xml, _classes));
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
     * Creates an MxFxtr00700103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr00700103 message
     * @return
     *     a new instance of MxFxtr00700103
     */
    public static final MxFxtr00700103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr00700103 .class);
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
