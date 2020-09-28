
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.013.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pepOrISAOrPrtflTrfConfV02"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.013.001.02")
public class MxSese01300102
    extends AbstractMX
{

    @XmlElement(name = "PEPOrISAOrPrtflTrfConfV02", required = true)
    protected PEPOrISAOrPortfolioTransferConfirmationV02 pepOrISAOrPrtflTrfConfV02;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 13;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account5 .class, Account6 .class, ActiveCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CashAccount11 .class, CashAccountIdentification1Choice.class, ClearingSystemMemberIdentificationChoice.class, Extension1 .class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument11 .class, GenderCode.class, GenericIdentification1 .class, ISAType1Code.class, ISAYearsOfIssue3 .class, IndividualPerson8 .class, MessageIdentification1 .class, MxSese01300102 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation4 .class, PEPISATransfer4 .class, PEPOrISAOrPortfolioTransferConfirmationV02 .class, PartyIdentification2Choice.class, PartyIdentification4Choice.class, Portfolio1 .class, PostalAddress1 .class, PreviousYear1 .class, PreviousYearChoice.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, SubscriptionInformation1 .class, TransferType1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.013.001.02";

    public MxSese01300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01300102(final String xml) {
        this();
        MxSese01300102 tmp = parse(xml);
        pepOrISAOrPrtflTrfConfV02 = tmp.getPEPOrISAOrPrtflTrfConfV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pepOrISAOrPrtflTrfConfV02 property.
     * 
     * @return
     *     possible object is
     *     {@link PEPOrISAOrPortfolioTransferConfirmationV02 }
     *     
     */
    public PEPOrISAOrPortfolioTransferConfirmationV02 getPEPOrISAOrPrtflTrfConfV02() {
        return pepOrISAOrPrtflTrfConfV02;
    }

    /**
     * Sets the value of the pepOrISAOrPrtflTrfConfV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PEPOrISAOrPortfolioTransferConfirmationV02 }
     *     
     */
    public MxSese01300102 setPEPOrISAOrPrtflTrfConfV02(PEPOrISAOrPortfolioTransferConfirmationV02 value) {
        this.pepOrISAOrPrtflTrfConfV02 = value;
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
    public static MxSese01300102 parse(String xml) {
        return ((MxSese01300102) MxReadImpl.parse(MxSese01300102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01300102 parse(String xml, MxRead parserImpl) {
        return ((MxSese01300102) parserImpl.read(MxSese01300102 .class, xml, _classes));
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
     * Creates an MxSese01300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01300102 message
     * @return
     *     a new instance of MxSese01300102
     */
    public final static MxSese01300102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese01300102 .class);
    }

}
