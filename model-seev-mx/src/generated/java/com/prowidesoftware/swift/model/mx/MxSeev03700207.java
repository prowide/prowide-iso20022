
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.037.002.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntRvslAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.037.002.07")
public class MxSeev03700207
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntRvslAdvc", required = true)
    protected CorporateActionMovementReversalAdvice002V07 corpActnMvmntRvslAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 37;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account9Choice.class, AccountAndBalance40 .class, AdditionalBusinessProcess7Code.class, AdditionalBusinessProcessFormat14Choice.class, BalanceFormat7Choice.class, CashAccountIdentification6Choice.class, CashOption48 .class, CorporateAction36 .class, CorporateActionDate50 .class, CorporateActionEventReference4 .class, CorporateActionEventReference4Choice.class, CorporateActionEventStage4Code.class, CorporateActionEventStageFormat15Choice.class, CorporateActionEventType16Code.class, CorporateActionEventType41Choice.class, CorporateActionGeneralInformation98 .class, CorporateActionMovementReversalAdvice002V07 .class, CorporateActionNarrative35 .class, CorporateActionOption126 .class, CorporateActionOption26Choice.class, CorporateActionOption8Code.class, CorporateActionReversalReason1Code.class, CorporateActionReversalReason4 .class, CorporateActionReversalReason4Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode22Choice.class, DateFormat34Choice.class, DateType8Code.class, DocumentIdentification37 .class, DocumentIdentification38 .class, DocumentIdentification4Choice.class, DocumentNumber6Choice.class, FinancialInstrumentQuantity15Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification86 .class, IdentificationSource4Choice.class, IntermediateSecuritiesDistributionTypeFormat17Choice.class, IntermediateSecurityDistributionType4Code.class, LotteryType1Code.class, LotteryTypeFormat5Choice.class, MxSeev03700207 .class, NameAndAddress12 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, PartyIdentification104Choice.class, ProcessingPosition10Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity9 .class, Quantity10Choice.class, Quantity21Choice.class, RestrictedFINActiveCurrencyAndAmount.class, SecuritiesOption58 .class, SecurityIdentification20 .class, ShortLong1Code.class, SignedQuantityFormat8 .class, SignedQuantityFormat9 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.037.002.07";

    public MxSeev03700207() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03700207(final String xml) {
        this();
        MxSeev03700207 tmp = parse(xml);
        corpActnMvmntRvslAdvc = tmp.getCorpActnMvmntRvslAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03700207(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntRvslAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementReversalAdvice002V07 }
     *     
     */
    public CorporateActionMovementReversalAdvice002V07 getCorpActnMvmntRvslAdvc() {
        return corpActnMvmntRvslAdvc;
    }

    /**
     * Sets the value of the corpActnMvmntRvslAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementReversalAdvice002V07 }
     *     
     */
    public MxSeev03700207 setCorpActnMvmntRvslAdvc(CorporateActionMovementReversalAdvice002V07 value) {
        this.corpActnMvmntRvslAdvc = value;
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
    public static MxSeev03700207 parse(String xml) {
        return ((MxSeev03700207) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03700207 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03700207 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03700207) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03700207 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03700207 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03700207) parserImpl.read(MxSeev03700207 .class, xml, _classes));
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
     * Creates an MxSeev03700207 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03700207 message
     * @return
     *     a new instance of MxSeev03700207
     */
    public final static MxSeev03700207 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03700207 .class);
    }

}
