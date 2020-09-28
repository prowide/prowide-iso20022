
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
 * Class for seev.033.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.033.001.05")
public class MxSeev03300105
    extends AbstractMX
{

    @XmlElement(name = "CorpActnInstr", required = true)
    protected CorporateActionInstructionV05 corpActnInstr;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 33;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountAndBalance17 .class, ActiveCurrencyAnd13DecimalAmount.class, AddressType2Code.class, AlternatePartyIdentification2 .class, AmountPrice3 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity3 .class, AmountPriceType1Code.class, BalanceFormat1Choice.class, BeneficiaryCertificationType5Code.class, BeneficiaryCertificationType6Choice.class, ClassificationType2Choice.class, CorporateActionBalanceDetails12 .class, CorporateActionChangeType2Code.class, CorporateActionChangeTypeFormat2Choice.class, CorporateActionEventReference1 .class, CorporateActionEventReference1Choice.class, CorporateActionEventType10Code.class, CorporateActionEventType11Choice.class, CorporateActionGeneralInformation71 .class, CorporateActionInstructionV05 .class, CorporateActionNarrative21 .class, CorporateActionNarrative8 .class, CorporateActionOption103 .class, CorporateActionOption12Choice.class, CorporateActionOption9Code.class, CorporateActionPrice44 .class, CorporateActionRate47 .class, DateAndDateTimeChoice.class, DocumentIdentification13 .class, DocumentIdentification15 .class, DocumentIdentification1Choice.class, DocumentNumber1Choice.class, FinancialInstrumentAttributes50 .class, FinancialInstrumentQuantity1Choice.class, FractionDispositionType10Code.class, FractionDispositionType17Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, IdentificationSource3Choice.class, IdentificationType4Choice.class, IndicativeOrMarketPrice2Choice.class, InstructedOrQuantityToReceive1Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, MarketIdentification3Choice.class, MxSeev03300105 .class, NameAndAddress5 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, OriginalAndCurrentQuantities2 .class, OtherIdentification1 .class, PartyIdentification36Choice.class, PartyIdentification48Choice.class, PartyIdentification56 .class, PercentagePrice1 .class, PostalAddress1 .class, PriceFormat33Choice.class, PriceFormat5Choice.class, PriceRateType3Code.class, PriceValueType9Code.class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity2 .class, ProprietaryQuantity3 .class, Quantity1Code.class, Quantity2Choice.class, Quantity3Choice.class, Quantity4Choice.class, Quantity5Choice.class, RateAndAmountFormat21Choice.class, RateAndAmountFormat5Choice.class, RateType28Choice.class, RateTypeAndPercentageRate1 .class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SecuritiesOption2 .class, SecurityIdentification14 .class, ShortLong1Code.class, SignedQuantityFormat1 .class, SignedQuantityFormat2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification1Code.class, WithholdingTaxRateType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.033.001.05";

    public MxSeev03300105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03300105(final String xml) {
        this();
        MxSeev03300105 tmp = parse(xml);
        corpActnInstr = tmp.getCorpActnInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03300105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionV05 }
     *     
     */
    public CorporateActionInstructionV05 getCorpActnInstr() {
        return corpActnInstr;
    }

    /**
     * Sets the value of the corpActnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionV05 }
     *     
     */
    public MxSeev03300105 setCorpActnInstr(CorporateActionInstructionV05 value) {
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
    public static MxSeev03300105 parse(String xml) {
        return ((MxSeev03300105) MxReadImpl.parse(MxSeev03300105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03300105 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03300105) parserImpl.read(MxSeev03300105 .class, xml, _classes));
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
     * Creates an MxSeev03300105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03300105 message
     * @return
     *     a new instance of MxSeev03300105
     */
    public final static MxSeev03300105 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev03300105 .class);
    }

}
