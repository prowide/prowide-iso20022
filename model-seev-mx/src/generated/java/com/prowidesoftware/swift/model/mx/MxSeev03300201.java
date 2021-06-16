
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
 * Class for seev.033.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.033.002.01")
public class MxSeev03300201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstr", required = true)
    protected CorporateActionInstruction002V01 corpActnInstr;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 33;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountAndBalance5 .class, AlternateIdentification2 .class, AlternatePartyIdentification3 .class, AmountPrice5 .class, AmountPricePerAmount3 .class, AmountPricePerFinancialInstrumentQuantity4 .class, AmountPriceType1Code.class, BalanceFormat2Choice.class, BeneficiaryCertificationType3Code.class, BeneficiaryCertificationType4Choice.class, ClassificationType3Choice.class, CopyDuplicate1Code.class, CorporateActionBalanceDetails5 .class, CorporateActionChangeType2Code.class, CorporateActionChangeTypeFormat4Choice.class, CorporateActionEventReference2 .class, CorporateActionEventReference2Choice.class, CorporateActionEventType4Choice.class, CorporateActionEventType6Code.class, CorporateActionGeneralInformation15 .class, CorporateActionInstruction002V01 .class, CorporateActionNarrative12 .class, CorporateActionNarrative13 .class, CorporateActionOption13 .class, CorporateActionOption4Code.class, CorporateActionOption6Choice.class, CorporateActionPrice11 .class, CorporateActionRate9 .class, DateAndDateTimeChoice.class, DocumentIdentification18 .class, DocumentIdentification19 .class, DocumentIdentification20 .class, DocumentIdentification2Choice.class, DocumentNumber2Choice.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentAttributes9 .class, FinancialInstrumentQuantity15Choice.class, FractionDispositionType3Code.class, FractionDispositionType8Choice.class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, IdentificationSource2Choice.class, IdentificationType5Choice.class, IndicativeOrMarketPrice4Choice.class, InstructedOrQuantityToReceive2Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, MarketIdentification2Choice.class, MarketIdentification7 .class, MarketType3Code.class, MarketTypeFormat2Choice.class, MxSeev03300201 .class, NameAndAddress12 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities3 .class, OriginalAndCurrentQuantities4 .class, PartyIdentification16Choice.class, PartyIdentification18Choice.class, PartyIdentification34 .class, PercentagePrice1 .class, PriceFormat17Choice.class, PriceFormat18Choice.class, PriceRateType3Code.class, PriceValueType4Code.class, ProcessingPosition3Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity4 .class, ProprietaryQuantity5 .class, Quantity11Choice.class, Quantity1Code.class, Quantity7Choice.class, Quantity8Choice.class, Quantity9Choice.class, RateAndAmountFormat13Choice.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat5Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText5 .class, SecuritiesOption7 .class, SecurityIdentification12 .class, SecurityIdentification12Choice.class, ShortLong1Code.class, SignedQuantityFormat3 .class, SignedQuantityFormat4 .class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.033.002.01";

    public MxSeev03300201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03300201(final String xml) {
        this();
        MxSeev03300201 tmp = parse(xml);
        corpActnInstr = tmp.getCorpActnInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03300201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstruction002V01 }
     *     
     */
    public CorporateActionInstruction002V01 getCorpActnInstr() {
        return corpActnInstr;
    }

    /**
     * Sets the value of the corpActnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstruction002V01 }
     *     
     */
    public MxSeev03300201 setCorpActnInstr(CorporateActionInstruction002V01 value) {
        this.corpActnInstr = value;
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
    public static MxSeev03300201 parse(String xml) {
        return ((MxSeev03300201) MxReadImpl.parse(MxSeev03300201 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03300201 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03300201) parserImpl.read(MxSeev03300201 .class, xml, _classes));
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
     * Creates an MxSeev03300201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03300201 message
     * @return
     *     a new instance of MxSeev03300201
     */
    public final static MxSeev03300201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03300201 .class);
    }

}
