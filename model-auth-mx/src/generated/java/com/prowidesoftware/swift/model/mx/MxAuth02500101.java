
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
 * Class for auth.025.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ccyCtrlSpprtgDocDlvry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.025.001.01")
public class MxAuth02500101
    extends AbstractMX
{

    @XmlElement(name = "CcyCtrlSpprtgDocDlvry", required = true)
    protected CurrencyControlSupportingDocumentDeliveryV01 ccyCtrlSpprtgDocDlvry;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 25;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, BinaryFile1 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, ContractRegistrationReference1Choice.class, CurrencyControlHeader3 .class, CurrencyControlSupportingDocumentDeliveryV01 .class, DateAndPlaceOfBirth.class, DocumentAmendment1 .class, DocumentGeneralInformation3 .class, DocumentIdentification22 .class, DocumentIdentification28 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MxAuth02500101 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, Party28Choice.class, PartyIdentification77 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress19 .class, PostalAddress6 .class, ShipmentAttribute1 .class, SignatureEnvelopeReference.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SupportingDocument1 .class, SupportingDocumentEntry1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.025.001.01";

    public MxAuth02500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth02500101(final String xml) {
        this();
        MxAuth02500101 tmp = parse(xml);
        ccyCtrlSpprtgDocDlvry = tmp.getCcyCtrlSpprtgDocDlvry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth02500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ccyCtrlSpprtgDocDlvry property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyControlSupportingDocumentDeliveryV01 }
     *     
     */
    public CurrencyControlSupportingDocumentDeliveryV01 getCcyCtrlSpprtgDocDlvry() {
        return ccyCtrlSpprtgDocDlvry;
    }

    /**
     * Sets the value of the ccyCtrlSpprtgDocDlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyControlSupportingDocumentDeliveryV01 }
     *     
     */
    public MxAuth02500101 setCcyCtrlSpprtgDocDlvry(CurrencyControlSupportingDocumentDeliveryV01 value) {
        this.ccyCtrlSpprtgDocDlvry = value;
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
    public static MxAuth02500101 parse(String xml) {
        return ((MxAuth02500101) MxReadImpl.parse(MxAuth02500101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth02500101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth02500101) parserImpl.read(MxAuth02500101 .class, xml, _classes));
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
     * Creates an MxAuth02500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth02500101 message
     * @return
     *     a new instance of MxAuth02500101
     */
    public final static MxAuth02500101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAuth02500101 .class);
    }

}
