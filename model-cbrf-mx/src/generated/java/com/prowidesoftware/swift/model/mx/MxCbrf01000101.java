
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
 * Class for cbrf.010.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ufnddShrtPossNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:cbrf:xsd:cbrf.010.001.01")
public class MxCbrf01000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "UfnddShrtPossNtfctn", required = true)
    protected UnfundedShortPositionsNotificationV01 ufnddShrtPossNtfctn;
    public static final transient String BUSINESS_PROCESS = "cbrf";
    public static final transient int FUNCTIONALITY = 10;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, DateAndPlaceOfBirth.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader58 .class, MxCbrf01000101 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessQuery1 .class, Pagination.class, Party11Choice.class, PartyIdentification43 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ShortPositionsReportDetails1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnfundedShortPositionsNotificationV01 .class };
    public static final transient String NAMESPACE = "urn:cbrf:xsd:cbrf.010.001.01";

    public MxCbrf01000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCbrf01000101(final String xml) {
        this();
        MxCbrf01000101 tmp = parse(xml);
        ufnddShrtPossNtfctn = tmp.getUfnddShrtPossNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCbrf01000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ufnddShrtPossNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link UnfundedShortPositionsNotificationV01 }
     *     
     */
    public UnfundedShortPositionsNotificationV01 getUfnddShrtPossNtfctn() {
        return ufnddShrtPossNtfctn;
    }

    /**
     * Sets the value of the ufnddShrtPossNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnfundedShortPositionsNotificationV01 }
     *     
     */
    public MxCbrf01000101 setUfnddShrtPossNtfctn(UnfundedShortPositionsNotificationV01 value) {
        this.ufnddShrtPossNtfctn = value;
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
    public static MxCbrf01000101 parse(String xml) {
        return ((MxCbrf01000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCbrf01000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCbrf01000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCbrf01000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCbrf01000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCbrf01000101 parse(String xml, MxRead parserImpl) {
        return ((MxCbrf01000101) parserImpl.read(MxCbrf01000101 .class, xml, _classes));
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
     * Creates an MxCbrf01000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCbrf01000101 message
     * @return
     *     a new instance of MxCbrf01000101
     */
    public static final MxCbrf01000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCbrf01000101 .class);
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
