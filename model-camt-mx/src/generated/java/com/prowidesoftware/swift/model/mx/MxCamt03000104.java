
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
 * Class for camt.030.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ntfctnOfCaseAssgnmt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.030.001.04")
public class MxCamt03000104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "NtfctnOfCaseAssgnmt", required = true)
    protected NotificationOfCaseAssignmentV04 ntfctnOfCaseAssgnmt;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 30;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, Case3 .class, CaseAssignment3 .class, CaseForwardingNotification3 .class, CaseForwardingNotification3Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, DateAndPlaceOfBirth.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MxCamt03000104 .class, NamePrefix1Code.class, NotificationOfCaseAssignmentV04 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, Party12Choice.class, PartyIdentification43 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ReportHeader4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.030.001.04";

    public MxCamt03000104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt03000104(final String xml) {
        this();
        MxCamt03000104 tmp = parse(xml);
        ntfctnOfCaseAssgnmt = tmp.getNtfctnOfCaseAssgnmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt03000104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ntfctnOfCaseAssgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationOfCaseAssignmentV04 }
     *     
     */
    public NotificationOfCaseAssignmentV04 getNtfctnOfCaseAssgnmt() {
        return ntfctnOfCaseAssgnmt;
    }

    /**
     * Sets the value of the ntfctnOfCaseAssgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationOfCaseAssignmentV04 }
     *     
     */
    public MxCamt03000104 setNtfctnOfCaseAssgnmt(NotificationOfCaseAssignmentV04 value) {
        this.ntfctnOfCaseAssgnmt = value;
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
    public static MxCamt03000104 parse(String xml) {
        return ((MxCamt03000104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt03000104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt03000104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt03000104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt03000104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt03000104 parse(String xml, MxRead parserImpl) {
        return ((MxCamt03000104) parserImpl.read(MxCamt03000104 .class, xml, _classes));
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
     * Creates an MxCamt03000104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt03000104 message
     * @return
     *     a new instance of MxCamt03000104
     */
    public static final MxCamt03000104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt03000104 .class);
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
