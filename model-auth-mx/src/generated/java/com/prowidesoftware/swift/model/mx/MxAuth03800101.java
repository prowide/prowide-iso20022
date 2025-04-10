
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.038.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "invcTaxRptStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.038.001.01")
public class MxAuth03800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "InvcTaxRptStsAdvc", required = true)
    protected InvoiceTaxReportStatusAdviceV01 invcTaxRptStsAdvc;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 38;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, ContactDetails2 .class, GenericValidationRuleIdentification1 .class, InvoiceTaxReportStatusAdviceV01 .class, InvoiceTaxReportTransactionStatus1 .class, InvoiceTaxStatusReportHeader1 .class, MessageIdentification1 .class, MxAuth03800101 .class, NamePrefix1Code.class, PostalAddress6 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxOrganisationIdentification1 .class, TaxReportingStatus1Code.class, TaxReportingStatus2Code.class, ValidationRuleSchemeName1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.038.001.01";

    public MxAuth03800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth03800101(final String xml) {
        this();
        MxAuth03800101 tmp = parse(xml);
        invcTaxRptStsAdvc = tmp.getInvcTaxRptStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth03800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the invcTaxRptStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTaxReportStatusAdviceV01 }
     *     
     */
    public InvoiceTaxReportStatusAdviceV01 getInvcTaxRptStsAdvc() {
        return invcTaxRptStsAdvc;
    }

    /**
     * Sets the value of the invcTaxRptStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTaxReportStatusAdviceV01 }
     *     
     */
    public MxAuth03800101 setInvcTaxRptStsAdvc(InvoiceTaxReportStatusAdviceV01 value) {
        this.invcTaxRptStsAdvc = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxAuth03800101 parse(String xml) {
        return ((MxAuth03800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth03800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth03800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth03800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth03800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth03800101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth03800101) parserImpl.read(MxAuth03800101 .class, xml, _classes));
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
     * Creates an MxAuth03800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth03800101 message
     * @return
     *     a new instance of MxAuth03800101
     */
    public final static MxAuth03800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth03800101 .class);
    }

}
