
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
 * Class for seev.014.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCAElctnCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.014.001.01")
public class MxSeev01400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AgtCAElctnCxlReq", required = true)
    protected AgentCAElectionCancellationRequestV01 agtCAElctnCxlReq;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification2Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AgentCAElectionCancellationRequestV01 .class, AlternateSecurityIdentification3 .class, CashAccount19 .class, CorporateActionCashMovements2 .class, CorporateActionElection3 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType1FormatChoice.class, CorporateActionEventType2Code.class, CorporateActionEventType2FormatChoice.class, CorporateActionInformation1 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary1FormatChoice.class, CorporateActionOption1FormatChoice.class, CorporateActionOptionType1Code.class, CorporateActionSecuritiesMovement2 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DocumentIdentification8 .class, FinancialInstrumentDescription3 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, GenericIdentification13 .class, MxSeev01400101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, SecuritiesAccount7 .class, SecuritiesAccount9 .class, SecuritiesBalanceType10Code.class, SecuritiesBalanceType10FormatChoice.class, SecurityIdentification7 .class, UnitOrFaceAmount1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.014.001.01";

    public MxSeev01400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev01400101(final String xml) {
        this();
        MxSeev01400101 tmp = parse(xml);
        agtCAElctnCxlReq = tmp.getAgtCAElctnCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev01400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the agtCAElctnCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCAElectionCancellationRequestV01 }
     *     
     */
    public AgentCAElectionCancellationRequestV01 getAgtCAElctnCxlReq() {
        return agtCAElctnCxlReq;
    }

    /**
     * Sets the value of the agtCAElctnCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCAElectionCancellationRequestV01 }
     *     
     */
    public MxSeev01400101 setAgtCAElctnCxlReq(AgentCAElectionCancellationRequestV01 value) {
        this.agtCAElctnCxlReq = value;
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
    public static MxSeev01400101 parse(String xml) {
        return ((MxSeev01400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev01400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev01400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev01400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev01400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev01400101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev01400101) parserImpl.read(MxSeev01400101 .class, xml, _classes));
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
     * Creates an MxSeev01400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev01400101 message
     * @return
     *     a new instance of MxSeev01400101
     */
    public final static MxSeev01400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev01400101 .class);
    }

}
