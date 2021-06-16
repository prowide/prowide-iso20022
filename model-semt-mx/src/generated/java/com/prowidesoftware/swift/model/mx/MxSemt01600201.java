
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
 * Class for semt.016.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntPstngRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.016.002.01")
public class MxSemt01600201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraPosMvmntPstngRpt", required = true)
    protected IntraPositionMovementPostingReport002V01 intraPosMvmntPstngRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AlternateIdentification2 .class, ClassificationType3Choice.class, CopyDuplicate1Code.class, CorporateActionEventType4Choice.class, CorporateActionEventType6Code.class, DateAndDateTimeChoice.class, DateTimePeriodDetails.class, DocumentIdentification16 .class, EventFrequency3Code.class, EventFrequency4Code.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentAttributes13 .class, FinancialInstrumentDetails4 .class, FinancialInstrumentQuantity15Choice.class, FormOfSecurity1Code.class, FormOfSecurity3Choice.class, Frequency5Choice.class, Frequency6Choice.class, GenericIdentification18 .class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, IdentificationSource2Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, IntraPositionDetails6 .class, IntraPositionMovementDetails2 .class, IntraPositionMovementPostingReport002V01 .class, MarketIdentification2Choice.class, MarketIdentification9 .class, MarketType5Choice.class, MarketType5Code.class, MxSemt01600201 .class, NameAndAddress12 .class, Number3Choice.class, Number4Choice.class, OptionStyle2Code.class, OptionStyle5Choice.class, OptionType1Code.class, OptionType3Choice.class, Pagination.class, PartyIdentification16Choice.class, PartyIdentification18Choice.class, PaymentDirection3Choice.class, Period2 .class, Period2Choice.class, PreferenceToIncome1Code.class, PreferenceToIncome3Choice.class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType2Choice.class, PriceValueType1Code.class, QuantityBreakdown6 .class, References11Choice.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount17 .class, SecuritiesBalanceType11Code.class, SecuritiesBalanceType5Choice.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus3Choice.class, SecurityIdentification12 .class, SecurityIdentification12Choice.class, Statement22 .class, StatementUpdateType1Code.class, UpdateType3Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.016.002.01";

    public MxSemt01600201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01600201(final String xml) {
        this();
        MxSemt01600201 tmp = parse(xml);
        intraPosMvmntPstngRpt = tmp.getIntraPosMvmntPstngRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01600201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntPstngRpt property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementPostingReport002V01 }
     *     
     */
    public IntraPositionMovementPostingReport002V01 getIntraPosMvmntPstngRpt() {
        return intraPosMvmntPstngRpt;
    }

    /**
     * Sets the value of the intraPosMvmntPstngRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementPostingReport002V01 }
     *     
     */
    public MxSemt01600201 setIntraPosMvmntPstngRpt(IntraPositionMovementPostingReport002V01 value) {
        this.intraPosMvmntPstngRpt = value;
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
    public static MxSemt01600201 parse(String xml) {
        return ((MxSemt01600201) MxReadImpl.parse(MxSemt01600201 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01600201 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01600201) parserImpl.read(MxSemt01600201 .class, xml, _classes));
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
     * Creates an MxSemt01600201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01600201 message
     * @return
     *     a new instance of MxSemt01600201
     */
    public final static MxSemt01600201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01600201 .class);
    }

}
