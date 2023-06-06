
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
 * Class for camt.007.002.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt00700202"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.007.002.02")
public class MxCamt00700202
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.007.002.02", required = true)
    protected Camt00700202 camt00700202;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 7;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, AddressType2Code.class, BranchAndFinancialInstitutionIdentification.class, BranchData.class, Camt00700202 .class, Case.class, CaseAssignment.class, CashAccount3 .class, CashAccountType3Code.class, CashClearingSystem2Code.class, ChargeBearer1Code.class, ClearingSystemMemberIdentificationChoice.class, CurrencyAndAmount.class, DocumentType1Code.class, FinancialInstitutionIdentification1 .class, GenericIdentification3 .class, GenericIdentification4 .class, Instruction1Code.class, Instruction3Code.class, InstructionForFinalAgent.class, MxCamt00700202 .class, NonFinancialInstitutionIdentification1 .class, Party1Choice.class, PartyIdentification1 .class, PaymentInstructionExtract2 .class, PaymentPurpose1Code.class, PaymentSchemeChoice.class, PersonIdentification2 .class, PostalAddress1 .class, PurposeChoice.class, ReferredDocumentAmount1Choice.class, RemittanceInformation3Choice.class, RequestedModification.class, SWIFTServiceLevel2Code.class, SimpleIdentificationInformation.class, StructuredRemittanceInformation2 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.007.002.02";

    public MxCamt00700202() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00700202(final String xml) {
        this();
        MxCamt00700202 tmp = parse(xml);
        camt00700202 = tmp.getCamt00700202();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00700202(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt00700202 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt00700202 }
     *     
     */
    public Camt00700202 getCamt00700202() {
        return camt00700202;
    }

    /**
     * Sets the value of the camt00700202 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt00700202 }
     *     
     */
    public MxCamt00700202 setCamt00700202(Camt00700202 value) {
        this.camt00700202 = value;
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
    public static MxCamt00700202 parse(String xml) {
        return ((MxCamt00700202) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00700202 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00700202 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00700202) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00700202 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00700202 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00700202) parserImpl.read(MxCamt00700202 .class, xml, _classes));
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
     * Creates an MxCamt00700202 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00700202 message
     * @return
     *     a new instance of MxCamt00700202
     */
    public static final MxCamt00700202 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00700202 .class);
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
