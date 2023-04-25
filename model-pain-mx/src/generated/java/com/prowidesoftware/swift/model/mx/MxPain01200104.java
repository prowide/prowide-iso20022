
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
 * Class for pain.012.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mndtAccptncRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.012.001.04")
public class MxPain01200104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MndtAccptncRpt", required = true)
    protected MandateAcceptanceReportV04 mndtAccptncRpt;
    public static final transient String BUSINESS_PROCESS = "pain";
    public static final transient int FUNCTIONALITY = 12;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptanceResult6 .class, AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, Authorisation1Choice.class, Authorisation1Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, DateAndPlaceOfBirth.class, DatePeriodDetails1 .class, DocumentType6Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, Frequency21Choice.class, Frequency6Code.class, FrequencyPeriod1 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader47 .class, LocalInstrument2Choice.class, Mandate5 .class, MandateAcceptance4 .class, MandateAcceptanceReportV04 .class, MandateOccurrences3 .class, MandateReason1Choice.class, MandateSetupReason1Choice.class, MandateTypeInformation1 .class, MxPain01200104 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalMandate3Choice.class, OriginalMessageInformation1 .class, Party11Choice.class, PartyIdentification43 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ReferredDocumentInformation6 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, SequenceType2Code.class, ServiceLevel8Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pain.012.001.04";

    public MxPain01200104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPain01200104(final String xml) {
        this();
        MxPain01200104 tmp = parse(xml);
        mndtAccptncRpt = tmp.getMndtAccptncRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPain01200104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mndtAccptncRpt property.
     * 
     * @return
     *     possible object is
     *     {@link MandateAcceptanceReportV04 }
     *     
     */
    public MandateAcceptanceReportV04 getMndtAccptncRpt() {
        return mndtAccptncRpt;
    }

    /**
     * Sets the value of the mndtAccptncRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateAcceptanceReportV04 }
     *     
     */
    public MxPain01200104 setMndtAccptncRpt(MandateAcceptanceReportV04 value) {
        this.mndtAccptncRpt = value;
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
    public static MxPain01200104 parse(String xml) {
        return ((MxPain01200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain01200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPain01200104 parse(String xml, MxReadConfiguration conf) {
        return ((MxPain01200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain01200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPain01200104 parse(String xml, MxRead parserImpl) {
        return ((MxPain01200104) parserImpl.read(MxPain01200104 .class, xml, _classes));
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
     * Creates an MxPain01200104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPain01200104 message
     * @return
     *     a new instance of MxPain01200104
     */
    public static final MxPain01200104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPain01200104 .class);
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
