
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
 * Class for sese.014.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "prtflTrfCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.014.001.03")
public class MxSese01400103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PrtflTrfCxlReq", required = true)
    protected PortfolioTransferCancellationRequestV03 prtflTrfCxlReq;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account5 .class, Account6 .class, ActiveCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CashAccount11 .class, CashAccountIdentification1Choice.class, ClearingSystemMemberIdentificationChoice.class, CurrentYearType1Choice.class, Extension1 .class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument25 .class, GenderCode.class, GenericIdentification1 .class, ISAPortfolio1Choice.class, ISATransfer3 .class, ISAType1Code.class, ISAYearsOfIssue4 .class, IndividualPerson8 .class, MessageIdentification1 .class, MxSese01400103 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation4 .class, PEPISATransfer11 .class, PartyIdentification2Choice.class, PartyIdentification4Choice.class, Portfolio1 .class, PortfolioTransferCancellationRequestV03 .class, PostalAddress1 .class, PreviousYear1Choice.class, PreviousYear2 .class, ResidualCash1Code.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, SubscriptionInformation1 .class, TransferReference3 .class, TransferReference4 .class, TransferType1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.014.001.03";

    public MxSese01400103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01400103(final String xml) {
        this();
        MxSese01400103 tmp = parse(xml);
        prtflTrfCxlReq = tmp.getPrtflTrfCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01400103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the prtflTrfCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioTransferCancellationRequestV03 }
     *     
     */
    public PortfolioTransferCancellationRequestV03 getPrtflTrfCxlReq() {
        return prtflTrfCxlReq;
    }

    /**
     * Sets the value of the prtflTrfCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioTransferCancellationRequestV03 }
     *     
     */
    public MxSese01400103 setPrtflTrfCxlReq(PortfolioTransferCancellationRequestV03 value) {
        this.prtflTrfCxlReq = value;
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
    public static MxSese01400103 parse(String xml) {
        return ((MxSese01400103) MxReadImpl.parse(MxSese01400103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01400103 parse(String xml, MxRead parserImpl) {
        return ((MxSese01400103) parserImpl.read(MxSese01400103 .class, xml, _classes));
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
     * Creates an MxSese01400103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01400103 message
     * @return
     *     a new instance of MxSese01400103
     */
    public final static MxSese01400103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01400103 .class);
    }

}
