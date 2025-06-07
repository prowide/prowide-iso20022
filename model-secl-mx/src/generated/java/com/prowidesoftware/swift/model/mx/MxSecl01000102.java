
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for secl.010.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sttlmOblgtnRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:secl.010.001.02")
public class MxSecl01000102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SttlmOblgtnRpt", required = true)
    protected SettlementObligationReportV02 sttlmOblgtnRpt;
    public final static transient String BUSINESS_PROCESS = "secl";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification4 .class, AmountAndDirection27 .class, ClearingAccountType1Code.class, ContactIdentification2 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode3Choice.class, DateFormat11Choice.class, DateType1Code.class, DeliveringPartiesAndAccount7 .class, DeliveryReceiptType2Code.class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms17 .class, GenericIdentification20 .class, GenericIdentification29 .class, GenericIdentification30 .class, IdentificationSource3Choice.class, IdentificationType6Choice.class, MarketIdentification1Choice.class, MarketIdentification20 .class, MarketType2Code.class, MarketType8Choice.class, MxSecl01000102 .class, NameAndAddress5 .class, NameAndAddress6 .class, NamePrefix1Code.class, ObligationType1Choice.class, ObligationType1Code.class, OtherIdentification1 .class, Pagination.class, PartyIdentification33Choice.class, PartyIdentification34Choice.class, PartyIdentification35Choice.class, PartyIdentificationAndAccount31 .class, PartyIdentificationAndAccount32 .class, PartyTextInformation1 .class, PostalAddress1 .class, PostalAddress2 .class, Price4 .class, PriceRateOrAmountChoice.class, PriceValueType7Code.class, ReceiveDelivery1Code.class, ReceivingPartiesAndAccount7 .class, Reference19 .class, Report2 .class, ReportParameters4 .class, SecuritiesAccount18 .class, SecuritiesAccount19 .class, SecurityIdentification14 .class, SettlementObligation4 .class, SettlementObligation5 .class, SettlementObligationReportV02 .class, SettlementParties2Choice.class, SimpleIdentificationInformation.class, SubAccount1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate3Choice.class, TradingCapacity5Code.class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:secl.010.001.02";

    public MxSecl01000102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSecl01000102(final String xml) {
        this();
        MxSecl01000102 tmp = parse(xml);
        sttlmOblgtnRpt = tmp.getSttlmOblgtnRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSecl01000102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sttlmOblgtnRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementObligationReportV02 }
     *     
     */
    public SettlementObligationReportV02 getSttlmOblgtnRpt() {
        return sttlmOblgtnRpt;
    }

    /**
     * Sets the value of the sttlmOblgtnRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementObligationReportV02 }
     *     
     */
    public MxSecl01000102 setSttlmOblgtnRpt(SettlementObligationReportV02 value) {
        this.sttlmOblgtnRpt = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSecl01000102 parse(String xml) {
        return ((MxSecl01000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSecl01000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSecl01000102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSecl01000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSecl01000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSecl01000102 parse(String xml, MxRead parserImpl) {
        return ((MxSecl01000102) parserImpl.read(MxSecl01000102 .class, xml, _classes));
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
     * Creates an MxSecl01000102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSecl01000102 message
     * @return
     *     a new instance of MxSecl01000102
     */
    public final static MxSecl01000102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSecl01000102 .class);
    }

}
