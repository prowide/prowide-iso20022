
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
 * Class for semt.013.002.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.013.002.04")
public class MxSemt01300204
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraPosMvmntInstr", required = true)
    protected IntraPositionMovementInstruction002V04 intraPosMvmntInstr;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 13;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ClassificationType33Choice.class, DateAndDateTimeChoice.class, DocumentNumber6Choice.class, EventFrequency3Code.class, FinancialInstrumentAttributes75 .class, FinancialInstrumentQuantity15Choice.class, FinancialInstrumentQuantity1Choice.class, FormOfSecurity1Code.class, FormOfSecurity7Choice.class, Frequency27Choice.class, GenericIdentification18 .class, GenericIdentification39 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, Identification16 .class, IdentificationSource3Choice.class, IdentificationSource4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, IntraPositionDetails36 .class, IntraPositionMovementInstruction002V04 .class, Linkages42 .class, MarketIdentification4Choice.class, MxSemt01300204 .class, Number23Choice.class, NumberCount1Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OptionType1Code.class, OptionType7Choice.class, OtherIdentification2 .class, OtherIdentification3 .class, PartyIdentification103Choice.class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType2Choice.class, PriceValueType1Code.class, PriorityNumeric5Choice.class, ProcessingPosition10Choice.class, ProcessingPosition3Code.class, QuantityBreakdown33 .class, QuantityBreakdown34 .class, References50Choice.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat17Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount27 .class, SecuritiesBalanceType11Code.class, SecuritiesBalanceType8Choice.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus6Choice.class, SecuritiesSubBalanceTypeAndQuantityBreakdown4 .class, SecurityIdentification20 .class, SecurityIdentification32 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalNumber1 .class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.013.002.04";

    public MxSemt01300204() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01300204(final String xml) {
        this();
        MxSemt01300204 tmp = parse(xml);
        intraPosMvmntInstr = tmp.getIntraPosMvmntInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01300204(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntInstr property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementInstruction002V04 }
     *     
     */
    public IntraPositionMovementInstruction002V04 getIntraPosMvmntInstr() {
        return intraPosMvmntInstr;
    }

    /**
     * Sets the value of the intraPosMvmntInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementInstruction002V04 }
     *     
     */
    public MxSemt01300204 setIntraPosMvmntInstr(IntraPositionMovementInstruction002V04 value) {
        this.intraPosMvmntInstr = value;
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
    public static MxSemt01300204 parse(String xml) {
        return ((MxSemt01300204) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01300204 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01300204 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01300204) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01300204 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01300204 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01300204) parserImpl.read(MxSemt01300204 .class, xml, _classes));
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
     * Creates an MxSemt01300204 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01300204 message
     * @return
     *     a new instance of MxSemt01300204
     */
    public static final MxSemt01300204 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01300204 .class);
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
