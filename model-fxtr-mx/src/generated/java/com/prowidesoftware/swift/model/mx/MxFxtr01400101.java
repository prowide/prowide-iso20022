
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
 * Class for fxtr.014.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:fxtr.014.001.01")
public class MxFxtr01400101
    extends AbstractMX
{

    @XmlElement(name = "FXTradInstr", required = true)
    protected ForeignExchangeTradeInstructionV01 fxTradInstr;
    public final static transient String BUSINESS_PROCESS = "fxtr";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate1 .class, AmountsAndValueDate1 .class, ContactInformation1 .class, ForeignExchangeTradeInstructionV01 .class, FundIdentification2 .class, GeneralInformation1 .class, MxFxtr01400101 .class, NameAndAddress8 .class, PartyIdentification22 .class, PartyIdentification8Choice.class, PostalAddress1 .class, SettlementParties1 .class, TradeAgreement3 .class, TradePartyIdentification3 .class, Trading1MethodCode.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:fxtr.014.001.01";

    public MxFxtr01400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr01400101(final String xml) {
        this();
        MxFxtr01400101 tmp = parse(xml);
        fxTradInstr = tmp.getFXTradInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr01400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradInstr property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeInstructionV01 }
     *     
     */
    public ForeignExchangeTradeInstructionV01 getFXTradInstr() {
        return fxTradInstr;
    }

    /**
     * Sets the value of the fxTradInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeInstructionV01 }
     *     
     */
    public MxFxtr01400101 setFXTradInstr(ForeignExchangeTradeInstructionV01 value) {
        this.fxTradInstr = value;
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
    public static MxFxtr01400101 parse(String xml) {
        return ((MxFxtr01400101) MxReadImpl.parse(MxFxtr01400101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr01400101 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr01400101) parserImpl.read(MxFxtr01400101 .class, xml, _classes));
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
     * Creates an MxFxtr01400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr01400101 message
     * @return
     *     a new instance of MxFxtr01400101
     */
    public final static MxFxtr01400101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxFxtr01400101 .class);
    }

}
