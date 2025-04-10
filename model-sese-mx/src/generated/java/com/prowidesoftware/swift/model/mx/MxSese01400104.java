
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
 * Class for sese.014.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "prtflTrfCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.014.001.04")
public class MxSese01400104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PrtflTrfCxlReq", required = true)
    protected PortfolioTransferCancellationRequestV04 prtflTrfCxlReq;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 14;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account5 .class, Account6 .class, AccountIdentification1 .class, ActiveCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, Cancellation3Choice.class, CashAccount11 .class, CashAccountIdentification1Choice.class, ClearingSystemMemberIdentificationChoice.class, CurrentYearType1Choice.class, Extension1 .class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument32 .class, GenderCode.class, GenericIdentification1 .class, ISAPortfolio1Choice.class, ISATransfer8 .class, ISATransfer9 .class, ISAType1Code.class, ISAYearsOfIssue4 .class, IndividualPerson8 .class, MessageIdentification1 .class, MxSese01400104 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation4 .class, PartyIdentification2Choice.class, PartyIdentification4Choice.class, PartyIdentificationAndAccount93 .class, Portfolio1 .class, PortfolioTransferCancellationRequestV04 .class, PostalAddress1 .class, PreviousYear1Choice.class, PreviousYear2 .class, ResidualCash1Code.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, SubscriptionInformation1 .class, TransferReference3 .class, TransferReference4 .class, TransferType1Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:sese.014.001.04";

    public MxSese01400104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01400104(final String xml) {
        this();
        MxSese01400104 tmp = parse(xml);
        prtflTrfCxlReq = tmp.getPrtflTrfCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01400104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the prtflTrfCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioTransferCancellationRequestV04 }
     *     
     */
    public PortfolioTransferCancellationRequestV04 getPrtflTrfCxlReq() {
        return prtflTrfCxlReq;
    }

    /**
     * Sets the value of the prtflTrfCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioTransferCancellationRequestV04 }
     *     
     */
    public MxSese01400104 setPrtflTrfCxlReq(PortfolioTransferCancellationRequestV04 value) {
        this.prtflTrfCxlReq = value;
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
    public static MxSese01400104 parse(String xml) {
        return ((MxSese01400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese01400104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese01400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01400104 parse(String xml, MxRead parserImpl) {
        return ((MxSese01400104) parserImpl.read(MxSese01400104 .class, xml, _classes));
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
     * Creates an MxSese01400104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01400104 message
     * @return
     *     a new instance of MxSese01400104
     */
    public static final MxSese01400104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01400104 .class);
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
