
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.008.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rgltryTxRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.008.001.02")
public class MxAuth00800102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RgltryTxRpt", required = true)
    protected RegulatoryTransactionReportV02 rgltryTxRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CurrencyAndAmount.class, DocumentIdentification8 .class, Extension1 .class, FinancialInstrument15 .class, GenericIdentification1 .class, GenericIdentification3 .class, MxAuth00800102 .class, NameAndAddress5 .class, OffMarket1Choice.class, OffMarket1Code.class, OptionTypeCode.class, OrderDriverCode.class, PartyIdentification11Choice.class, PartyIdentification23 .class, PartyIdentification23Choice.class, PartyIdentification24Choice.class, PartyIdentification2Choice.class, PlaceOfTradeIdentification2Choice.class, PostalAddress1 .class, PriceRateOrAmountChoice.class, RegulatoryTransactionReportV02 .class, SecurityClassificationType1Choice.class, SecurityIdentification6Choice.class, SecurityInstrumentDescription2 .class, TradingCapacity3Code.class, TransactionDetails3 .class, UnitOrFaceAmountChoice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.008.001.02";

    public MxAuth00800102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth00800102(final String xml) {
        this();
        MxAuth00800102 tmp = parse(xml);
        rgltryTxRpt = tmp.getRgltryTxRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth00800102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rgltryTxRpt property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryTransactionReportV02 }
     *     
     */
    public RegulatoryTransactionReportV02 getRgltryTxRpt() {
        return rgltryTxRpt;
    }

    /**
     * Sets the value of the rgltryTxRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryTransactionReportV02 }
     *     
     */
    public MxAuth00800102 setRgltryTxRpt(RegulatoryTransactionReportV02 value) {
        this.rgltryTxRpt = value;
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
    public static MxAuth00800102 parse(String xml) {
        return ((MxAuth00800102) MxReadImpl.parse(MxAuth00800102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth00800102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth00800102) parserImpl.read(MxAuth00800102 .class, xml, _classes));
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
     * Creates an MxAuth00800102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth00800102 message
     * @return
     *     a new instance of MxAuth00800102
     */
    public final static MxAuth00800102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth00800102 .class);
    }

}
