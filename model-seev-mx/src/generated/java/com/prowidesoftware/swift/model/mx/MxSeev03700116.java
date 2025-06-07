
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
 * Class for seev.037.001.16 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntRvslAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.037.001.16")
public class MxSeev03700116
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntRvslAdvc", required = true)
    protected CorporateActionMovementReversalAdviceV16 corpActnMvmntRvslAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 37;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 16;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account10Choice.class, AccountAndBalance50 .class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess7Code.class, AdditionalBusinessProcessFormat11Choice.class, AddressType2Code.class, BalanceFormat11Choice.class, BlockChainAddressWallet3 .class, CashAccountIdentification5Choice.class, CashAccountIdentification9Choice.class, CashOption109 .class, CorporateAction70 .class, CorporateActionDate86 .class, CorporateActionEventReference3 .class, CorporateActionEventReference3Choice.class, CorporateActionEventStage4Code.class, CorporateActionEventStageFormat14Choice.class, CorporateActionEventType109Choice.class, CorporateActionEventType37Code.class, CorporateActionGeneralInformation179 .class, CorporateActionMovementReversalAdviceV16 .class, CorporateActionNarrative31 .class, CorporateActionOption12Code.class, CorporateActionOption240 .class, CorporateActionOption33Choice.class, CorporateActionReversalReason10Choice.class, CorporateActionReversalReason3Code.class, CorporateActionReversalReason8 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode19Choice.class, DateFormat30Choice.class, DateType8Code.class, DocumentIdentification31 .class, DocumentIdentification32 .class, DocumentIdentification3Choice.class, DocumentNumber5Choice.class, FinancialInstrumentQuantity33Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, IntermediateSecuritiesDistributionTypeFormat15Choice.class, IntermediateSecurityDistributionType5Code.class, LotteryType1Code.class, LotteryTypeFormat4Choice.class, MxSeev03700116 .class, NameAndAddress5 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification120Choice.class, PostalAddress1 .class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, ProprietaryQuantity8 .class, Quantity48Choice.class, Quantity51Choice.class, SecuritiesOption80 .class, SecurityIdentification19 .class, ShortLong1Code.class, SignedQuantityFormat10 .class, SignedQuantityFormat11 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionIdentification15 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.037.001.16";

    public MxSeev03700116() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03700116(final String xml) {
        this();
        MxSeev03700116 tmp = parse(xml);
        corpActnMvmntRvslAdvc = tmp.getCorpActnMvmntRvslAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03700116(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntRvslAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementReversalAdviceV16 }
     *     
     */
    public CorporateActionMovementReversalAdviceV16 getCorpActnMvmntRvslAdvc() {
        return corpActnMvmntRvslAdvc;
    }

    /**
     * Sets the value of the corpActnMvmntRvslAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementReversalAdviceV16 }
     *     
     */
    public MxSeev03700116 setCorpActnMvmntRvslAdvc(CorporateActionMovementReversalAdviceV16 value) {
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
    public static MxSeev03700116 parse(String xml) {
        return ((MxSeev03700116) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03700116 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03700116 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03700116) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03700116 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03700116 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03700116) parserImpl.read(MxSeev03700116 .class, xml, _classes));
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
     * Creates an MxSeev03700116 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03700116 message
     * @return
     *     a new instance of MxSeev03700116
     */
    public final static MxSeev03700116 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03700116 .class);
    }

}
