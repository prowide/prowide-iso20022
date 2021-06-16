
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
 * Class for seev.033.001.11 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.033.001.11")
public class MxSeev03300111
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstr", required = true)
    protected CorporateActionInstructionV11 corpActnInstr;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 33;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 11;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountAndBalance41 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification7 .class, AmountPrice3 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity6 .class, AmountPriceType1Code.class, BalanceFormat5Choice.class, BeneficiaryCertificationType10Choice.class, BeneficiaryCertificationType5Code.class, ClassificationType32Choice.class, CorporateActionBalanceDetails32 .class, CorporateActionChangeType2Code.class, CorporateActionChangeTypeFormat6Choice.class, CorporateActionEventReference3 .class, CorporateActionEventReference3Choice.class, CorporateActionEventType102Choice.class, CorporateActionEventType34Code.class, CorporateActionGeneralInformation156 .class, CorporateActionInstructionV11 .class, CorporateActionNarrative30 .class, CorporateActionNarrative32 .class, CorporateActionOption16Code.class, CorporateActionOption180 .class, CorporateActionOption40Choice.class, CorporateActionPrice60 .class, CorporateActionRate71 .class, DateAndDateTime2Choice.class, DocumentIdentification31 .class, DocumentIdentification32 .class, DocumentIdentification3Choice.class, DocumentNumber5Choice.class, FinancialInstrumentAttributes81 .class, FinancialInstrumentQuantity1Choice.class, FractionDispositionType10Code.class, FractionDispositionType28Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, IndicativeOrMarketPrice8Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, MarketIdentification3Choice.class, MxSeev03300111 .class, NameAndAddress5 .class, OptionFeatures12Code.class, OptionFeaturesFormat25Choice.class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, OriginalAndCurrentQuantities6 .class, OtherIdentification1 .class, PartyIdentification127Choice.class, PartyIdentification229Choice.class, PartyIdentification236 .class, PercentagePrice1 .class, PostalAddress1 .class, PriceFormat49Choice.class, PriceFormat50Choice.class, PriceRateType3Code.class, PriceValueType9Code.class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, ProprietaryQuantity7 .class, ProprietaryQuantity8 .class, ProtectInstruction1 .class, ProtectTransactionType2Code.class, Quantity17Choice.class, Quantity18Choice.class, Quantity19Choice.class, Quantity1Code.class, Quantity20Choice.class, RateAndAmountFormat37Choice.class, RateAndAmountFormat39Choice.class, RateAndAmountFormat40Choice.class, RateType42Choice.class, RateTypeAndPercentageRate8 .class, RateValueType7Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecuritiesOption72 .class, SecuritiesQuantityOrAmount4Choice.class, SecurityIdentification19 .class, ShortLong1Code.class, SignedQuantityFormat6 .class, SignedQuantityFormat7 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification1Code.class, WithholdingTaxRateType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.033.001.11";

    public MxSeev03300111() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03300111(final String xml) {
        this();
        MxSeev03300111 tmp = parse(xml);
        corpActnInstr = tmp.getCorpActnInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03300111(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionV11 }
     *     
     */
    public CorporateActionInstructionV11 getCorpActnInstr() {
        return corpActnInstr;
    }

    /**
     * Sets the value of the corpActnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionV11 }
     *     
     */
    public MxSeev03300111 setCorpActnInstr(CorporateActionInstructionV11 value) {
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
    public static MxSeev03300111 parse(String xml) {
        return ((MxSeev03300111) MxReadImpl.parse(MxSeev03300111 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03300111 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03300111) parserImpl.read(MxSeev03300111 .class, xml, _classes));
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
     * Creates an MxSeev03300111 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03300111 message
     * @return
     *     a new instance of MxSeev03300111
     */
    public final static MxSeev03300111 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03300111 .class);
    }

}
