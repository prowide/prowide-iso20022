
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
 * Class for colr.024.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trptyCollAllgmtNtfctnCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.024.001.01")
public class MxColr02400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrptyCollAllgmtNtfctnCxlAdvc", required = true)
    protected TripartyCollateralAllegementNotificationCancellationAdviceV01 trptyCollAllgmtNtfctnCxlAdvc;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 24;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification7 .class, AmountAndDirection49 .class, BlockChainAddressWallet3 .class, CollateralParties8 .class, CollateralRole1Code.class, CollateralTransactionType1Choice.class, CollateralTransactionType1Code.class, CreditDebitCode.class, DateAndDateTime2Choice.class, ExposureType14Code.class, ExposureType23Choice.class, ForeignExchangeTerms23 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationType42Choice.class, MxColr02400101 .class, NameAndAddress5 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PartyIdentificationAndAccount193 .class, PartyIdentificationAndAccount202 .class, PartyIdentificationAndAccount203 .class, PostalAddress1 .class, SecuritiesAccount19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingCapacity7Code.class, TradingPartyCapacity5Choice.class, TransactionIdentifications44 .class, TripartyCollateralAllegementNotificationCancellationAdviceV01 .class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.024.001.01";

    public MxColr02400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr02400101(final String xml) {
        this();
        MxColr02400101 tmp = parse(xml);
        trptyCollAllgmtNtfctnCxlAdvc = tmp.getTrptyCollAllgmtNtfctnCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr02400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trptyCollAllgmtNtfctnCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link TripartyCollateralAllegementNotificationCancellationAdviceV01 }
     *     
     */
    public TripartyCollateralAllegementNotificationCancellationAdviceV01 getTrptyCollAllgmtNtfctnCxlAdvc() {
        return trptyCollAllgmtNtfctnCxlAdvc;
    }

    /**
     * Sets the value of the trptyCollAllgmtNtfctnCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripartyCollateralAllegementNotificationCancellationAdviceV01 }
     *     
     */
    public MxColr02400101 setTrptyCollAllgmtNtfctnCxlAdvc(TripartyCollateralAllegementNotificationCancellationAdviceV01 value) {
        this.trptyCollAllgmtNtfctnCxlAdvc = value;
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
    public static MxColr02400101 parse(String xml) {
        return ((MxColr02400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr02400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr02400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr02400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr02400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr02400101 parse(String xml, MxRead parserImpl) {
        return ((MxColr02400101) parserImpl.read(MxColr02400101 .class, xml, _classes));
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
     * Creates an MxColr02400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr02400101 message
     * @return
     *     a new instance of MxColr02400101
     */
    public final static MxColr02400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr02400101 .class);
    }

}
