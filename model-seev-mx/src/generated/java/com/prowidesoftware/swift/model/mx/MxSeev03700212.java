
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
 * Class for seev.037.002.12 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntRvslAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.037.002.12")
public class MxSeev03700212
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntRvslAdvc", required = true)
    protected CorporateActionMovementReversalAdvice002V12 corpActnMvmntRvslAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 37;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 12;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account9Choice.class, AccountAndBalance40 .class, AdditionalBusinessProcess7Code.class, AdditionalBusinessProcessFormat14Choice.class, BalanceFormat7Choice.class, CashAccountIdentification6Choice.class, CashOption62 .class, CorporateAction47 .class, CorporateActionDate66 .class, CorporateActionEventReference4 .class, CorporateActionEventReference4Choice.class, CorporateActionEventStage4Code.class, CorporateActionEventStageFormat15Choice.class, CorporateActionEventType30Code.class, CorporateActionEventType96Choice.class, CorporateActionGeneralInformation149 .class, CorporateActionMovementReversalAdvice002V12 .class, CorporateActionNarrative35 .class, CorporateActionOption12Code.class, CorporateActionOption175 .class, CorporateActionOption39Choice.class, CorporateActionReversalReason1Code.class, CorporateActionReversalReason4 .class, CorporateActionReversalReason4Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode22Choice.class, DateFormat49Choice.class, DateType8Code.class, DocumentIdentification37 .class, DocumentIdentification38 .class, DocumentIdentification4Choice.class, DocumentNumber6Choice.class, FinancialInstrumentQuantity15Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification86 .class, IdentificationSource4Choice.class, IntermediateSecuritiesDistributionTypeFormat17Choice.class, IntermediateSecurityDistributionType4Code.class, LotteryType1Code.class, LotteryTypeFormat5Choice.class, MxSeev03700212 .class, NameAndAddress12 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, PartyIdentification137Choice.class, ProcessingPosition10Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity9 .class, Quantity10Choice.class, Quantity21Choice.class, RestrictedFINActiveCurrencyAndAmount.class, SecuritiesOption69 .class, SecurityIdentification20 .class, ShortLong1Code.class, SignedQuantityFormat8 .class, SignedQuantityFormat9 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionIdentification1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.037.002.12";

    public MxSeev03700212() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03700212(final String xml) {
        this();
        MxSeev03700212 tmp = parse(xml);
        corpActnMvmntRvslAdvc = tmp.getCorpActnMvmntRvslAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03700212(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntRvslAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementReversalAdvice002V12 }
     *     
     */
    public CorporateActionMovementReversalAdvice002V12 getCorpActnMvmntRvslAdvc() {
        return corpActnMvmntRvslAdvc;
    }

    /**
     * Sets the value of the corpActnMvmntRvslAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementReversalAdvice002V12 }
     *     
     */
    public MxSeev03700212 setCorpActnMvmntRvslAdvc(CorporateActionMovementReversalAdvice002V12 value) {
        this.corpActnMvmntRvslAdvc = value;
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
    public static MxSeev03700212 parse(String xml) {
        return ((MxSeev03700212) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03700212 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03700212 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03700212) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03700212 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03700212 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03700212) parserImpl.read(MxSeev03700212 .class, xml, _classes));
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
     * Creates an MxSeev03700212 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03700212 message
     * @return
     *     a new instance of MxSeev03700212
     */
    public static final MxSeev03700212 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03700212 .class);
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
