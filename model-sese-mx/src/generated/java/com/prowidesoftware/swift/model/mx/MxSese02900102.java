
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
 * Class for sese.029.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmAllgmtRmvlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.029.001.02")
public class MxSese02900102
    extends AbstractMX
{

    @XmlElement(name = "SctiesSttlmAllgmtRmvlAdvc", required = true)
    protected SecuritiesSettlementAllegementRemovalAdviceV02 sctiesSttlmAllgmtRmvlAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 29;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection8 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DeliveryReceiptType2Code.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, Identification1 .class, IdentificationSource3Choice.class, MxSese02900102 .class, NameAndAddress5 .class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification36Choice.class, PartyIdentification37Choice.class, PartyIdentification43Choice.class, PartyIdentification44Choice.class, PartyIdentification46 .class, PartyIdentificationAndAccount43 .class, PostalAddress1 .class, Quantity6Choice.class, ReceiveDelivery1Code.class, SecuritiesAccount13 .class, SecuritiesSettlementAllegementRemovalAdviceV02 .class, SecurityIdentification14 .class, SettlementDate1Choice.class, SettlementDate4Code.class, SettlementDateCode1Choice.class, SettlementParties12 .class, SettlementTypeAndIdentification3 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate1Choice.class, TradeDateCode1Choice.class, TransactionDetails28 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.029.001.02";

    public MxSese02900102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02900102(final String xml) {
        this();
        MxSese02900102 tmp = parse(xml);
        sctiesSttlmAllgmtRmvlAdvc = tmp.getSctiesSttlmAllgmtRmvlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02900102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmAllgmtRmvlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementAllegementRemovalAdviceV02 }
     *     
     */
    public SecuritiesSettlementAllegementRemovalAdviceV02 getSctiesSttlmAllgmtRmvlAdvc() {
        return sctiesSttlmAllgmtRmvlAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmAllgmtRmvlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementAllegementRemovalAdviceV02 }
     *     
     */
    public MxSese02900102 setSctiesSttlmAllgmtRmvlAdvc(SecuritiesSettlementAllegementRemovalAdviceV02 value) {
        this.sctiesSttlmAllgmtRmvlAdvc = value;
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
    public static MxSese02900102 parse(String xml) {
        return ((MxSese02900102) MxReadImpl.parse(MxSese02900102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02900102 parse(String xml, MxRead parserImpl) {
        return ((MxSese02900102) parserImpl.read(MxSese02900102 .class, xml, _classes));
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
     * Creates an MxSese02900102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02900102 message
     * @return
     *     a new instance of MxSese02900102
     */
    public final static MxSese02900102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese02900102 .class);
    }

}
