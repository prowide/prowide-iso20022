
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
 * Class for seev.033.002.13 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.033.002.13")
public class MxSeev03300213
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstr", required = true)
    protected CorporateActionInstruction002V13 corpActnInstr;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 33;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 13;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountAndBalance62 .class, AlternatePartyIdentification11 .class, AlternatePartyIdentification9 .class, AmountPrice5 .class, AmountPricePerAmount3 .class, AmountPricePerFinancialInstrumentQuantity11 .class, AmountPriceType1Code.class, BalanceFormat14Choice.class, BeneficiaryCertificationType11Choice.class, BeneficiaryCertificationType5Code.class, ClassificationType33Choice.class, CorporateActionBalanceDetails44 .class, CorporateActionChangeType2Code.class, CorporateActionChangeTypeFormat7Choice.class, CorporateActionEventReference4 .class, CorporateActionEventReference4Choice.class, CorporateActionEventType119Choice.class, CorporateActionEventType40Code.class, CorporateActionGeneralInformation189 .class, CorporateActionInstruction002V13 .class, CorporateActionNarrative33 .class, CorporateActionNarrative34 .class, CorporateActionOption16Code.class, CorporateActionOption243 .class, CorporateActionOption43Choice.class, CorporateActionPrice91 .class, CorporateActionRate130 .class, DateAndDateTime2Choice.class, DocumentIdentification37 .class, DocumentIdentification38 .class, DocumentIdentification4Choice.class, DocumentNumber6Choice.class, FinancialInstrumentAttributes133 .class, FinancialInstrumentQuantity36Choice.class, FractionDispositionType10Code.class, FractionDispositionType29Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, IdentificationSource4Choice.class, IdentificationType44Choice.class, IdentificationType46Choice.class, IndicativeOrMarketPrice15Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, MarketIdentification4Choice.class, MxSeev03300213 .class, NameAndAddress12 .class, OptionFeatures12Code.class, OptionFeaturesFormat27Choice.class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities4 .class, OriginalAndCurrentQuantities7 .class, OtherIdentification2 .class, PartyIdentification136Choice.class, PartyIdentification259Choice.class, PartyIdentification317 .class, PercentagePrice2 .class, PriceFormat83Choice.class, PriceFormat84Choice.class, PriceRateType3Code.class, PriceValueType9Code.class, ProcessingPosition10Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity10 .class, ProprietaryQuantity9 .class, ProtectInstruction5 .class, ProtectTransactionType2Code.class, Quantity1Code.class, Quantity53Choice.class, Quantity55Choice.class, Quantity57Choice.class, Quantity80Choice.class, RateAndAmountFormat63Choice.class, RateAndAmountFormat64Choice.class, RateAndAmountFormat65Choice.class, RateType46Choice.class, RateTypeAndPercentageRate15 .class, RateValueType7Code.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat48Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText9 .class, SecuritiesOption88 .class, SecuritiesQuantityOrAmount7Choice.class, SecurityIdentification20 .class, ShortLong1Code.class, SignedQuantityFormat12 .class, SignedQuantityFormat13 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification1Code.class, WithholdingTaxRateType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.033.002.13";

    public MxSeev03300213() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03300213(final String xml) {
        this();
        MxSeev03300213 tmp = parse(xml);
        corpActnInstr = tmp.getCorpActnInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03300213(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstruction002V13 }
     *     
     */
    public CorporateActionInstruction002V13 getCorpActnInstr() {
        return corpActnInstr;
    }

    /**
     * Sets the value of the corpActnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstruction002V13 }
     *     
     */
    public MxSeev03300213 setCorpActnInstr(CorporateActionInstruction002V13 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSeev03300213 parse(String xml) {
        return ((MxSeev03300213) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03300213 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03300213 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03300213) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03300213 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03300213 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03300213) parserImpl.read(MxSeev03300213 .class, xml, _classes));
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
     * Creates an MxSeev03300213 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03300213 message
     * @return
     *     a new instance of MxSeev03300213
     */
    public final static MxSeev03300213 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03300213 .class);
    }

}
