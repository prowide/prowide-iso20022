
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
 * Class for semt.013.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.013.001.04")
public class MxSemt01300104
    extends AbstractMX
{

    @XmlElement(name = "IntraPosMvmntInstr", required = true)
    protected IntraPositionMovementInstructionV04 intraPosMvmntInstr;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 13;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ClassificationType32Choice.class, DateAndDateTimeChoice.class, DocumentNumber5Choice.class, EventFrequency3Code.class, FinancialInstrumentAttributes63 .class, FinancialInstrumentQuantity1Choice.class, FormOfSecurity1Code.class, FormOfSecurity6Choice.class, Frequency23Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, GenericIdentification78 .class, Identification14 .class, IdentificationSource3Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, IntraPositionDetails33 .class, IntraPositionMovementInstructionV04 .class, Linkages36 .class, MarketIdentification3Choice.class, MxSemt01300104 .class, Number22Choice.class, NumberCount1Choice.class, OptionStyle2Code.class, OptionStyle8Choice.class, OptionType1Code.class, OptionType6Choice.class, OtherIdentification1 .class, PartyIdentification92Choice.class, Price2 .class, PriceRateOrAmountChoice.class, PriceType1Choice.class, PriceValueType1Code.class, PriorityNumeric4Choice.class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, QuantityBreakdown31 .class, QuantityBreakdown32 .class, References41Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat10Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount24 .class, SecuritiesBalanceType11Code.class, SecuritiesBalanceType6Choice.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus5Choice.class, SecuritiesSubBalanceTypeAndQuantityBreakdown3 .class, SecurityIdentification19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalNumber1 .class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.013.001.04";

    public MxSemt01300104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01300104(final String xml) {
        this();
        MxSemt01300104 tmp = parse(xml);
        intraPosMvmntInstr = tmp.getIntraPosMvmntInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01300104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntInstr property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementInstructionV04 }
     *     
     */
    public IntraPositionMovementInstructionV04 getIntraPosMvmntInstr() {
        return intraPosMvmntInstr;
    }

    /**
     * Sets the value of the intraPosMvmntInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementInstructionV04 }
     *     
     */
    public MxSemt01300104 setIntraPosMvmntInstr(IntraPositionMovementInstructionV04 value) {
        this.intraPosMvmntInstr = value;
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
    public static MxSemt01300104 parse(String xml) {
        return ((MxSemt01300104) MxReadImpl.parse(MxSemt01300104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01300104 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01300104) parserImpl.read(MxSemt01300104 .class, xml, _classes));
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
     * Creates an MxSemt01300104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01300104 message
     * @return
     *     a new instance of MxSemt01300104
     */
    public final static MxSemt01300104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSemt01300104 .class);
    }

}
