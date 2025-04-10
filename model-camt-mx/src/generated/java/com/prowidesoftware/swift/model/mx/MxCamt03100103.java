
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
 * Class for camt.031.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rjctInvstgtn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.031.001.03")
public class MxCamt03100103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RjctInvstgtn", required = true)
    protected RejectInvestigationV03 rjctInvstgtn;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 31;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, BranchAndFinancialInstitutionIdentification4 .class, BranchData2 .class, Case2 .class, CaseAssignment2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, DateAndPlaceOfBirth.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification7 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, InvestigationRejection1Code.class, InvestigationRejectionJustification1 .class, MxCamt03100103 .class, NamePrefix1Code.class, OrganisationIdentification4 .class, OrganisationIdentificationSchemeName1Choice.class, Party6Choice.class, Party7Choice.class, PartyIdentification32 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, RejectInvestigationV03 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.031.001.03";

    public MxCamt03100103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt03100103(final String xml) {
        this();
        MxCamt03100103 tmp = parse(xml);
        rjctInvstgtn = tmp.getRjctInvstgtn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt03100103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rjctInvstgtn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectInvestigationV03 }
     *     
     */
    public RejectInvestigationV03 getRjctInvstgtn() {
        return rjctInvstgtn;
    }

    /**
     * Sets the value of the rjctInvstgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectInvestigationV03 }
     *     
     */
    public MxCamt03100103 setRjctInvstgtn(RejectInvestigationV03 value) {
        this.rjctInvstgtn = value;
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
    public static MxCamt03100103 parse(String xml) {
        return ((MxCamt03100103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt03100103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt03100103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt03100103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt03100103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt03100103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt03100103) parserImpl.read(MxCamt03100103 .class, xml, _classes));
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
     * Creates an MxCamt03100103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt03100103 message
     * @return
     *     a new instance of MxCamt03100103
     */
    public static final MxCamt03100103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt03100103 .class);
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
