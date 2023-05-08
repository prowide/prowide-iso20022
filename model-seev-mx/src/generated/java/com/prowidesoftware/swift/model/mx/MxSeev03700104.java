
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
 * Class for seev.037.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntRvslAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.037.001.04")
public class MxSeev03700104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntRvslAdvc", required = true)
    protected CorporateActionMovementReversalAdviceV04 corpActnMvmntRvslAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 37;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account8Choice.class, AccountAndBalance4 .class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess4Code.class, AdditionalBusinessProcessFormat7Choice.class, AddressType2Code.class, BalanceFormat1Choice.class, CashAccountIdentification5Choice.class, CashOption19 .class, CorporateActionEventReference1 .class, CorporateActionEventReference1Choice.class, CorporateActionEventType11Code.class, CorporateActionEventType12Choice.class, CorporateActionGeneralInformation50 .class, CorporateActionMovementReversalAdviceV04 .class, CorporateActionNarrative4 .class, CorporateActionOption11Choice.class, CorporateActionOption39 .class, CorporateActionOption8Code.class, CorporateActionReversalReason1 .class, CorporateActionReversalReason1Choice.class, CorporateActionReversalReason1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DocumentIdentification13 .class, DocumentIdentification15 .class, DocumentIdentification1Choice.class, DocumentNumber1Choice.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, IdentificationSource3Choice.class, IntermediateSecuritiesDistributionTypeFormat6Choice.class, IntermediateSecurityDistributionType4Code.class, MxSeev03700104 .class, NameAndAddress5 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification46Choice.class, PostalAddress1 .class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity2 .class, Quantity2Choice.class, Quantity6Choice.class, SecuritiesOption27 .class, SecurityIdentification14 .class, ShortLong1Code.class, SignedQuantityFormat1 .class, SignedQuantityFormat2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.037.001.04";

    public MxSeev03700104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03700104(final String xml) {
        this();
        MxSeev03700104 tmp = parse(xml);
        corpActnMvmntRvslAdvc = tmp.getCorpActnMvmntRvslAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03700104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntRvslAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementReversalAdviceV04 }
     *     
     */
    public CorporateActionMovementReversalAdviceV04 getCorpActnMvmntRvslAdvc() {
        return corpActnMvmntRvslAdvc;
    }

    /**
     * Sets the value of the corpActnMvmntRvslAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementReversalAdviceV04 }
     *     
     */
    public MxSeev03700104 setCorpActnMvmntRvslAdvc(CorporateActionMovementReversalAdviceV04 value) {
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
    public static MxSeev03700104 parse(String xml) {
        return ((MxSeev03700104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03700104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03700104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03700104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03700104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03700104 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03700104) parserImpl.read(MxSeev03700104 .class, xml, _classes));
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
     * Creates an MxSeev03700104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03700104 message
     * @return
     *     a new instance of MxSeev03700104
     */
    public static final MxSeev03700104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03700104 .class);
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
