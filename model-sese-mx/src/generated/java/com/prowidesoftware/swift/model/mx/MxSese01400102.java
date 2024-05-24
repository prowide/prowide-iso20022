
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
 * Class for sese.014.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pepOrISAOrPrtflTrfCxlReqV02"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.014.001.02")
public class MxSese01400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PEPOrISAOrPrtflTrfCxlReqV02", required = true)
    protected PEPOrISAOrPortfolioTransferCancellationRequestV02 pepOrISAOrPrtflTrfCxlReqV02;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 14;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account5 .class, Account6 .class, ActiveCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CashAccount11 .class, CashAccountIdentification1Choice.class, ClearingSystemMemberIdentificationChoice.class, Extension1 .class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument11 .class, GenderCode.class, GenericIdentification1 .class, ISAType1Code.class, ISAYearsOfIssue1 .class, IndividualPerson8 .class, MessageIdentification1 .class, MxSese01400102 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation4 .class, PEPISATransfer7 .class, PEPISATransfer8 .class, PEPOrISAOrPortfolioTransferCancellationRequestV02 .class, PartyIdentification2Choice.class, PartyIdentification4Choice.class, Portfolio1 .class, PostalAddress1 .class, PreviousYear1 .class, PreviousYearChoice.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, SubscriptionInformation1 .class, TransferReference3 .class, TransferReference4 .class, TransferType1Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:sese.014.001.02";

    public MxSese01400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01400102(final String xml) {
        this();
        MxSese01400102 tmp = parse(xml);
        pepOrISAOrPrtflTrfCxlReqV02 = tmp.getPEPOrISAOrPrtflTrfCxlReqV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pepOrISAOrPrtflTrfCxlReqV02 property.
     * 
     * @return
     *     possible object is
     *     {@link PEPOrISAOrPortfolioTransferCancellationRequestV02 }
     *     
     */
    public PEPOrISAOrPortfolioTransferCancellationRequestV02 getPEPOrISAOrPrtflTrfCxlReqV02() {
        return pepOrISAOrPrtflTrfCxlReqV02;
    }

    /**
     * Sets the value of the pepOrISAOrPrtflTrfCxlReqV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PEPOrISAOrPortfolioTransferCancellationRequestV02 }
     *     
     */
    public MxSese01400102 setPEPOrISAOrPrtflTrfCxlReqV02(PEPOrISAOrPortfolioTransferCancellationRequestV02 value) {
        this.pepOrISAOrPrtflTrfCxlReqV02 = value;
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
    public static MxSese01400102 parse(String xml) {
        return ((MxSese01400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese01400102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese01400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01400102 parse(String xml, MxRead parserImpl) {
        return ((MxSese01400102) parserImpl.read(MxSese01400102 .class, xml, _classes));
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
     * Creates an MxSese01400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01400102 message
     * @return
     *     a new instance of MxSese01400102
     */
    public static final MxSese01400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01400102 .class);
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
