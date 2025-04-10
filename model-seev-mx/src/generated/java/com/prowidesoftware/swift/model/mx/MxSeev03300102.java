
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
 * Class for seev.033.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.033.001.02")
public class MxSeev03300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstr", required = true)
    protected CorporateActionInstructionV02 corpActnInstr;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 33;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountAndBalance10 .class, ActiveCurrencyAnd13DecimalAmount.class, AddressType2Code.class, AlternatePartyIdentification2 .class, AmountPrice3 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity3 .class, AmountPriceType1Code.class, BalanceFormat1Choice.class, BeneficiaryCertificationType2Choice.class, BeneficiaryCertificationType3Code.class, ClassificationType2Choice.class, CorporateActionBalanceDetails3 .class, CorporateActionChangeType2Code.class, CorporateActionChangeTypeFormat2Choice.class, CorporateActionEventReference1 .class, CorporateActionEventReference1Choice.class, CorporateActionEventType3Choice.class, CorporateActionEventType6Code.class, CorporateActionGeneralInformation21 .class, CorporateActionInstructionV02 .class, CorporateActionNarrative7 .class, CorporateActionNarrative8 .class, CorporateActionOption25 .class, CorporateActionOption4Choice.class, CorporateActionOption4Code.class, CorporateActionPrice19 .class, CorporateActionRate8 .class, DateAndDateTimeChoice.class, DocumentIdentification13 .class, DocumentIdentification15 .class, DocumentIdentification1Choice.class, DocumentNumber1Choice.class, FinancialInstrumentAttributes18 .class, FinancialInstrumentQuantity1Choice.class, FractionDispositionType10Choice.class, FractionDispositionType6Code.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, IdentificationSource3Choice.class, IdentificationType4Choice.class, IndicativeOrMarketPrice2Choice.class, InstructedOrQuantityToReceive1Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, MarketIdentification1Choice.class, MarketIdentification2 .class, MarketType3Code.class, MarketTypeFormat1Choice.class, MxSeev03300102 .class, NameAndAddress5 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, OriginalAndCurrentQuantities2 .class, OtherIdentification1 .class, PartyIdentification36Choice.class, PartyIdentification48Choice.class, PartyIdentification50 .class, PercentagePrice1 .class, PostalAddress1 .class, PriceFormat21Choice.class, PriceFormat5Choice.class, PriceRateType3Code.class, PriceValueType9Code.class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity2 .class, ProprietaryQuantity3 .class, Quantity1Code.class, Quantity2Choice.class, Quantity3Choice.class, Quantity4Choice.class, Quantity5Choice.class, RateAndAmountFormat12Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SecuritiesOption2 .class, SecurityIdentification14 .class, ShortLong1Code.class, SignedQuantityFormat1 .class, SignedQuantityFormat2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.033.001.02";

    public MxSeev03300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03300102(final String xml) {
        this();
        MxSeev03300102 tmp = parse(xml);
        corpActnInstr = tmp.getCorpActnInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionV02 }
     *     
     */
    public CorporateActionInstructionV02 getCorpActnInstr() {
        return corpActnInstr;
    }

    /**
     * Sets the value of the corpActnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionV02 }
     *     
     */
    public MxSeev03300102 setCorpActnInstr(CorporateActionInstructionV02 value) {
        this.corpActnInstr = value;
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
    public static MxSeev03300102 parse(String xml) {
        return ((MxSeev03300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03300102 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03300102) parserImpl.read(MxSeev03300102 .class, xml, _classes));
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
     * Creates an MxSeev03300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03300102 message
     * @return
     *     a new instance of MxSeev03300102
     */
    public static final MxSeev03300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03300102 .class);
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
