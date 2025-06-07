
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
 * Class for secl.004.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "netPos"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:secl.004.001.04")
public class MxSecl00400104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "NetPos", required = true)
    protected NetPositionV04 netPos;
    public final static transient String BUSINESS_PROCESS = "secl";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification4 .class, AlternatePartyIdentification8 .class, AmountAndDirection21 .class, ClearingAccountType1Code.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode20Choice.class, DateFormat66Choice.class, DateType1Code.class, EventFrequency6Code.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification189 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, IdentificationType43Choice.class, IdentificationType6Choice.class, MarketIdentification1Choice.class, MarketIdentification20 .class, MarketIdentification84 .class, MarketIdentification85 .class, MarketType2Code.class, MarketType5Code.class, MarketType8Choice.class, MarketType9Choice.class, MxSecl00400104 .class, NameAndAddress13 .class, NameAndAddress5 .class, NameAndAddress6 .class, NetPosition4 .class, NetPositionV04 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification253Choice.class, PartyIdentification254Choice.class, PartyIdentification255Choice.class, PartyIdentification256Choice.class, PartyIdentificationAndAccount227 .class, PartyIdentificationAndAccount230 .class, PartyTextInformation1 .class, PostalAddress1 .class, PostalAddress2 .class, PostalAddress8 .class, Price14 .class, PriceRateOrAmount3Choice.class, PriceValueType7Code.class, ReceiveDelivery1Code.class, ReportParameters7 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat43Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier4 .class, SafekeepingPlaceTypeAndText1 .class, SecuritiesAccount18 .class, SecuritiesAccount19 .class, SecurityIdentification48 .class, Side1Code.class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeLeg13 .class, TradePosting1Code.class, TradeType1Code.class, TradingCapacity5Code.class, TypeOfIdentification1Code.class, TypeOfIdentification2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:secl.004.001.04";

    public MxSecl00400104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSecl00400104(final String xml) {
        this();
        MxSecl00400104 tmp = parse(xml);
        netPos = tmp.getNetPos();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSecl00400104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the netPos property.
     * 
     * @return
     *     possible object is
     *     {@link NetPositionV04 }
     *     
     */
    public NetPositionV04 getNetPos() {
        return netPos;
    }

    /**
     * Sets the value of the netPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetPositionV04 }
     *     
     */
    public MxSecl00400104 setNetPos(NetPositionV04 value) {
        this.netPos = value;
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
    public static MxSecl00400104 parse(String xml) {
        return ((MxSecl00400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSecl00400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSecl00400104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSecl00400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSecl00400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSecl00400104 parse(String xml, MxRead parserImpl) {
        return ((MxSecl00400104) parserImpl.read(MxSecl00400104 .class, xml, _classes));
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
     * Creates an MxSecl00400104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSecl00400104 message
     * @return
     *     a new instance of MxSecl00400104
     */
    public final static MxSecl00400104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSecl00400104 .class);
    }

}
