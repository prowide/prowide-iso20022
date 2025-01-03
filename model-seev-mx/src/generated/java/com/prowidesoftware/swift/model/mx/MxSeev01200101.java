
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
 * Class for seev.012.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCAElctnAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.012.001.01")
public class MxSeev01200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AgtCAElctnAdvc", required = true)
    protected AgentCAElectionAdviceV01 agtCAElctnAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 12;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification2Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AgentCAElectionAdviceV01 .class, AlternateSecurityIdentification3 .class, BeneficialOwner1 .class, BeneficiaryCertificationType1Code.class, BeneficiaryCertificationType1FormatChoice.class, CashAccount19 .class, CashAccountIdentification1Choice.class, ContactIdentification4 .class, ContactPerson1 .class, CorporateActionAdditionalInformation1 .class, CorporateActionCashMovements2 .class, CorporateActionElection3 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType1FormatChoice.class, CorporateActionEventType2Code.class, CorporateActionEventType2FormatChoice.class, CorporateActionInformation1 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary1FormatChoice.class, CorporateActionOption1FormatChoice.class, CorporateActionOptionType1Code.class, CorporateActionSecuritiesMovement2 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DocumentIdentification8 .class, ElectionAdviceFunction1 .class, ElectionType1Code.class, FinancialInstrumentDescription3 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification16 .class, MxSeev01200101 .class, NameAndAddress5 .class, NamePrefix1Code.class, PartyIdentification2Choice.class, PersonIdentificationType3Choice.class, PersonIdentificationType3Code.class, PostalAddress1 .class, ProceedsDelivery1 .class, SecuritiesAccount7 .class, SecuritiesAccount9 .class, SecuritiesBalanceType10Code.class, SecuritiesBalanceType10FormatChoice.class, SecurityIdentification7 .class, SimpleIdentificationInformation.class, UnitOrFaceAmount1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.012.001.01";

    public MxSeev01200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev01200101(final String xml) {
        this();
        MxSeev01200101 tmp = parse(xml);
        agtCAElctnAdvc = tmp.getAgtCAElctnAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev01200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the agtCAElctnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCAElectionAdviceV01 }
     *     
     */
    public AgentCAElectionAdviceV01 getAgtCAElctnAdvc() {
        return agtCAElctnAdvc;
    }

    /**
     * Sets the value of the agtCAElctnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCAElectionAdviceV01 }
     *     
     */
    public MxSeev01200101 setAgtCAElctnAdvc(AgentCAElectionAdviceV01 value) {
        this.agtCAElctnAdvc = value;
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
    public static MxSeev01200101 parse(String xml) {
        return ((MxSeev01200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev01200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev01200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev01200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev01200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev01200101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev01200101) parserImpl.read(MxSeev01200101 .class, xml, _classes));
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
     * Creates an MxSeev01200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev01200101 message
     * @return
     *     a new instance of MxSeev01200101
     */
    public static final MxSeev01200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev01200101 .class);
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
