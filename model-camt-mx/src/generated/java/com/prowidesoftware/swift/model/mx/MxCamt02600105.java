
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
 * Class for camt.026.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ublToApply"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.026.001.05")
public class MxCamt02600105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "UblToApply", required = true)
    protected UnableToApplyV05 ublToApply;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 26;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, Case3 .class, CaseAssignment3 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MissingOrIncorrectInformation3 .class, MxCamt02600105 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupInformation3 .class, Party11Choice.class, Party12Choice.class, PartyIdentification43 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnableToApplyIncorrect1 .class, UnableToApplyIncorrectInformation4Code.class, UnableToApplyJustification3Choice.class, UnableToApplyMissing1 .class, UnableToApplyMissingInformation3Code.class, UnableToApplyV05 .class, UnderlyingGroupInformation1 .class, UnderlyingPaymentInstruction3 .class, UnderlyingPaymentTransaction2 .class, UnderlyingStatementEntry1 .class, UnderlyingTransaction3Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.026.001.05";

    public MxCamt02600105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02600105(final String xml) {
        this();
        MxCamt02600105 tmp = parse(xml);
        ublToApply = tmp.getUblToApply();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02600105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ublToApply property.
     * 
     * @return
     *     possible object is
     *     {@link UnableToApplyV05 }
     *     
     */
    public UnableToApplyV05 getUblToApply() {
        return ublToApply;
    }

    /**
     * Sets the value of the ublToApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnableToApplyV05 }
     *     
     */
    public MxCamt02600105 setUblToApply(UnableToApplyV05 value) {
        this.ublToApply = value;
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
    public static MxCamt02600105 parse(String xml) {
        return ((MxCamt02600105) MxReadImpl.parse(MxCamt02600105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02600105 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02600105) parserImpl.read(MxCamt02600105 .class, xml, _classes));
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
     * Creates an MxCamt02600105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02600105 message
     * @return
     *     a new instance of MxCamt02600105
     */
    public final static MxCamt02600105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02600105 .class);
    }

}
