
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
 * Class for seev.033.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.033.001.01")
public class MxSeev03300101
    extends AbstractMX
{

    @XmlElement(name = "CorpActnInstr", required = true)
    protected CorporateActionInstructionV01 corpActnInstr;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 33;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountAndBalance2 .class, ActiveCurrencyAnd13DecimalAmount.class, AddressType2Code.class, AlternateIdentification1 .class, AlternatePartyIdentification2 .class, AmountPrice3 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity3 .class, AmountPriceType1Code.class, BalanceFormat1Choice.class, BeneficiaryCertificationType2Choice.class, BeneficiaryCertificationType3Code.class, ClassificationType2Choice.class, CopyDuplicate1Code.class, CorporateActionBalanceDetails3 .class, CorporateActionChangeType2Code.class, CorporateActionChangeTypeFormat2Choice.class, CorporateActionEventReference1 .class, CorporateActionEventReference1Choice.class, CorporateActionEventType3Choice.class, CorporateActionEventType6Code.class, CorporateActionGeneralInformation6 .class, CorporateActionInstructionV01 .class, CorporateActionNarrative7 .class, CorporateActionNarrative8 .class, CorporateActionOption4Choice.class, CorporateActionOption4Code.class, CorporateActionOption5 .class, CorporateActionPrice8 .class, CorporateActionRate8 .class, DateAndDateTimeChoice.class, DocumentIdentification12 .class, DocumentIdentification13 .class, DocumentIdentification15 .class, DocumentIdentification1Choice.class, DocumentNumber1Choice.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentAttributes6 .class, FinancialInstrumentQuantity1Choice.class, FractionDispositionType2Choice.class, FractionDispositionType3Code.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, IdentificationSource1Choice.class, IdentificationType4Choice.class, IndicativeOrMarketPrice2Choice.class, InstructedOrQuantityToReceive1Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, MarketIdentification1Choice.class, MarketIdentification2 .class, MarketType3Code.class, MarketTypeFormat1Choice.class, MxSeev03300101 .class, NameAndAddress5 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, OriginalAndCurrentQuantities2 .class, PartyIdentification10Choice.class, PartyIdentification13Choice.class, PartyIdentification33 .class, PercentagePrice1 .class, PostalAddress1 .class, PriceFormat5Choice.class, PriceFormat9Choice.class, PriceRateType3Code.class, PriceValueType4Code.class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity2 .class, ProprietaryQuantity3 .class, Quantity1Code.class, Quantity2Choice.class, Quantity3Choice.class, Quantity4Choice.class, Quantity5Choice.class, RateAndAmountFormat12Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SecuritiesOption2 .class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, ShortLong1Code.class, SignedQuantityFormat1 .class, SignedQuantityFormat2 .class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.033.001.01";

    public MxSeev03300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03300101(final String xml) {
        this();
        MxSeev03300101 tmp = parse(xml);
        corpActnInstr = tmp.getCorpActnInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionV01 }
     *     
     */
    public CorporateActionInstructionV01 getCorpActnInstr() {
        return corpActnInstr;
    }

    /**
     * Sets the value of the corpActnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionV01 }
     *     
     */
    public MxSeev03300101 setCorpActnInstr(CorporateActionInstructionV01 value) {
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
    public static MxSeev03300101 parse(String xml) {
        return ((MxSeev03300101) MxReadImpl.parse(MxSeev03300101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03300101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03300101) parserImpl.read(MxSeev03300101 .class, xml, _classes));
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
     * Creates an MxSeev03300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03300101 message
     * @return
     *     a new instance of MxSeev03300101
     */
    public final static MxSeev03300101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev03300101 .class);
    }

}
