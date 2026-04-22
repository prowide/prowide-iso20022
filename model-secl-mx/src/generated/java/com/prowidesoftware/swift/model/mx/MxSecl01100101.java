
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
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
 * Class for secl.011.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tradGvUpTakeUpReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT1secl.011.001.01")
public class MxSecl01100101
    extends AbstractMX
{

    @XmlElement(name = "TradGvUpTakeUpReq", required = true)
    protected TradeGiveUpTakeUpRequestV01 tradGvUpTakeUpReq;
    public static final transient String BUSINESS_PROCESS = "secl";
    public static final transient int FUNCTIONALITY = 11;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AmountAndDirection27 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms17 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, MarketIdentification1Choice.class, MarketIdentification84 .class, MarketType2Code.class, MarketType8Choice.class, MxSecl01100101 .class, NovationStatus1Code.class, OtherIdentification1 .class, PartyIdentification180Choice.class, Price14 .class, PriceRateOrAmount3Choice.class, PriceValueType7Code.class, SecuritiesTransactionType23Code.class, SecuritiesTransactionType47Choice.class, SecurityIdentification19 .class, SettlementTransactionCondition10Code.class, SettlementTransactionCondition16Choice.class, Side1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeData17 .class, TradeGiveUpTakeUpRequestV01 .class, TradeReference1 .class, TradeTransactionCondition4Code.class, TradeTransactionCondition5Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT1secl.011.001.01";

    public MxSecl01100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSecl01100101(final String xml) {
        this();
        MxSecl01100101 tmp = parse(xml);
        tradGvUpTakeUpReq = tmp.getTradGvUpTakeUpReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSecl01100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tradGvUpTakeUpReq property.
     * 
     * @return
     *     possible object is
     *     {@link TradeGiveUpTakeUpRequestV01 }
     *     
     */
    public TradeGiveUpTakeUpRequestV01 getTradGvUpTakeUpReq() {
        return tradGvUpTakeUpReq;
    }

    /**
     * Sets the value of the tradGvUpTakeUpReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeGiveUpTakeUpRequestV01 }
     *     
     */
    public MxSecl01100101 setTradGvUpTakeUpReq(TradeGiveUpTakeUpRequestV01 value) {
        this.tradGvUpTakeUpReq = value;
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
    public static MxSecl01100101 parse(String xml) {
        return ((MxSecl01100101) MxReadImpl.parse(MxSecl01100101 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSecl01100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSecl01100101) MxReadImpl.parse(MxSecl01100101 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSecl01100101 parse(String xml, MxRead parserImpl) {
        return ((MxSecl01100101) parserImpl.read(MxSecl01100101 .class, xml, _classes));
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
     * Creates an MxSecl01100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSecl01100101 message
     * @return
     *     a new instance of MxSecl01100101
     */
    public static final MxSecl01100101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSecl01100101 .class);
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
